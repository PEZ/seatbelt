(ns test.my.util-test
  (:require [clojure.test :refer [deftest is testing]]
            [my.util :as util]))

(deftest the-universe-and-everything
  (testing "The Universe"
    (is (= :the-universe-and-everything
           (util/the-question))
        "it knows the question")
    (is (= 42
           (util/the-answer))
        "it knows the answer")))