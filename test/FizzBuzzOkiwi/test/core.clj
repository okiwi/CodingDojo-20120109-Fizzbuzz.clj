(ns FizzBuzzOkiwi.test.core
  (:use [FizzBuzzOkiwi.core])
  (:use [clojure.test]))

(deftest replace-me ;; FIXME: write
  (is true "No tests have been written."))

(defn test-fizzbuzz [attendu parametre] (is (= attendu (fizzbuzz parametre))))

(deftest un-donne-un (test-fizzbuzz 1 1))

(deftest deux-donne-deux (test-fizzbuzz 2 2))

(deftest trois-donne-fizz (test-fizzbuzz :fizz 3))

(deftest six-donne-fizz (test-fizzbuzz :fizz 6))

(deftest cinq-donne-buzz (test-fizzbuzz :buzz 5))

(deftest quinze-donne-fizzbuzz (test-fizzbuzz :fizzbuzz 15))


