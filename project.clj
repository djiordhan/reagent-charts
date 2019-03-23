(defproject reagent-charts "0.1.0-SNAPSHOT"
  
  :description "FIXME: write description"
  
  :url "http://example.com/FIXME"
  
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  
  :main reagent-charts.core

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler
                        {:optimizations :none
                         :output-to "resources/public/javascripts/dev.js"
                         :output-dir "resources/public/javascripts/cljs-dev/"
                         :pretty-print true
                         :source-map true}}]}

  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-figwheel "0.3.7"]]


  :figwheel {:css-dirs ["resources/public/stylesheets"]}


  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]
                 [cljsjs/react-router "0.12.0-0"]
                 [secretary "1.2.3"]
                 [venantius/accountant "0.2.4"]
                 [reagent "0.7.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]])
