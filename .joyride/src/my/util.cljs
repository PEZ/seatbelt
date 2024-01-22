(ns my.util
  (:require [promesa.core :as p]))

(defn the-question []
  :the-universe-and-everything)

(defn the-answer []
  42)

(defn delayed-answer+ []
  (p/delay 10 (the-answer)))


