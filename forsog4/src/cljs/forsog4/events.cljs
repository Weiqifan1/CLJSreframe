(ns forsog4.events
  (:require
   [re-frame.core :as re-frame]
   [forsog4.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
