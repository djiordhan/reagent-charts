(ns reagent-charts.home
  (:require
   [accountant.core :as accountant]
   [reagent-charts.menu :refer [menu]]))

(defn home []
  [:div {:class "container"}
   [menu]
   [:div {:class "chart"} [:h1 "Please select a chart type to continue."]]])