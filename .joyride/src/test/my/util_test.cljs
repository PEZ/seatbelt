(ns test.my.util-test
  (:require [clojure.test :refer [deftest is testing async]]
            [seatbelt.macros :refer [deftest-async]]
            [my.util :as util]
            [promesa.core :as p]))

(deftest the-universe-and-everything
  (testing "The Universe"
    (is (= :the-universe-and-everything
           (util/the-question))
        "it knows the question")
    (is (= 42
           (util/the-answer))
        "it knows the answer")))

; NB: Only one async test per deftest
(deftest delayed-answer
  (async done
         (testing "Async test example"
           (-> (p/let [answer (util/delayed-answer+)]
                 (is (= 42 answer)))
               (p/finally (fn []
                            (done)))))))

; Or use the `deftest-async` macro for less boilerplate
(deftest-async delayed-answer-2
  (testing "Async test example using deftest-async macro"
    (p/let [answer (util/delayed-answer+)]
      (is (= 42 answer)))))

