(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
(if x (= 1 1) (= 1 2)))

(defn abs [x]
 (if (> x 0) x (- x x x)))

(defn divides? [divisor n]
  (if (= 0(mod n divisor)) (= 1 1) (= 1 2))) 

(defn fizzbuzz [n]
  (cond
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n 3)) "fizz"
    (= 0 (mod n 5)) "buzz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (cond
    (and true (teen? age)) (= 1 2)
    :else (= 1 1)
    )
  )

(defn generic-doublificate [x]
  (cond 
    (number? x) (* 2 x)
    (empty? x) (or)
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else (= 1 1)
    ))

(defn leap-year? [year]
  (cond
    (= (mod year 400) 0) (= 1 1)
    (= (mod year 100) 0) (= 1 2)
    (= (mod year 4) 0) (= 1 1)
    :else (= 1 2)))

; '_______'
;if (ano não é divisível por 4) então (é um ano comum)
;else if (ano não é divisível por 100) então (é um ano bissexto)
;else if (ano não é divisível por 400) então (é um ano comum)
;else (é um ano bissexto)