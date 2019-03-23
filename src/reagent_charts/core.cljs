(ns reagent-charts.core 
  (:require [reagent.core :as r]
            [reagent-charts.menu :refer [menu]] 
            [reagent-charts.home :refer [home]]
            [accountant.core :as accountant]
            [secretary.core :as secretary :include-macros true]
            [reagent-charts.activity :refer [activity]]
            [goog.events :as events]
            [goog.history.EventType :as HistoryEventType])
  (:import goog.History))

(def selected-page (r/atom home))

(defn page []
  [@selected-page])

(secretary/defroute "/" []
  (reset! selected-page home))

(secretary/defroute "/activity" []
  (reset! selected-page activity))

(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     HistoryEventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn mount-root []
  (r/render [page] (.getElementById js/document "cljs-target")))

(defn init! []
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (secretary/dispatch! path))
    :path-exists?
    (fn [path]
      (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))

 (mount-root)