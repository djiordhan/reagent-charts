(ns reagent-charts.menu)

(defn menu []
  [:div {:class "menu"}
   [:a {:href "chart/activity"} [:button {:class "text-uppercase"} "Activity"]]
   [:a {:href "chart/usage"} [:button {:class "text-uppercase"} "Usage"]]
   [:a {:href "chart/volumne"} [:button {:class "text-uppercase"} "Volume"]]
   ])