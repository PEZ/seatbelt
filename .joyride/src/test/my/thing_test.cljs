(ns test.my.thing-test
  (:require [clojure.test :refer [deftest is testing]]
            [my.thing :as thing]))

(deftest button-label
  (testing "The init button labeling"
    (is (= "Awesome!"
           (#'thing/button-label 0)))
    (is (= "OK"
           (#'thing/button-label 1)))
    (is (= "NYIP"
           (#'thing/button-label 42)))))