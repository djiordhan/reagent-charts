(ns reagent-charts.core 
  (:require [reagent.core :as reagent]
            [reagent-charts.menu :refer (menu)]
            [reagent-react-router.core :refer [Route DefaultRoute Link RouteHandler Redirect NotFound run-router defroutes]]
            [reagent-charts.activity :refer (activity)]))

(def app-state
  (reagent/atom
   {:message "Joneellll"}))

(def routes 
  (Route {:name "activity" :path "/activity" :handler activity}))

(defn app [] [:div {:class "container"}
              [menu]
              [:div {:class "chart"} [:h1 "Please select a chart type to continue."]]])

(reagent/render [app] (js/document.querySelector "#cljs-target"))
