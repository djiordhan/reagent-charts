(ns reagent-charts.core 
  (:require [reagent.core :as reagent]
            [reagent-charts.menu :refer (menu)]))

(def app-state
  (reagent/atom
   {:message "Joneellll"}))

(defn app [] [:div {:class "container"}
              [menu]
              [:div {:class "chart"} [:h1 "Please select a chart type to continue."]]])

(reagent/render [app] (js/document.querySelector "#cljs-target"))
