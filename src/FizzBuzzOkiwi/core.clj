(ns FizzBuzzOkiwi.core)

(defn fizzbuzz [x]
  (defn condf [f l]
    (if (f (first (first l)))
      (first (rest (first l)))
      (condf f (rest l)))
    )
  (defn multiple-de? [parametre] (= (mod x parametre) 0 ))

  (condf multiple-de?
    `((15 :fizzbuzz)
      (3 :fizz)
      (5 :buzz)
      (1 ~x))
    )
  )