(ns forsog4.views
  (:require
   [re-frame.core :as re-frame]
   [forsog4.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello chrLykke ** +from " @name]
     [:form]
     ]))
