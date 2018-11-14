(defn divides? [x y]
	(= (mod x y) 0)
)

(defn random-tens []
	(def divisor 10)
	(def numbers (repeatedly 10 #(rand-int 100)))
	(def predicate (fn [x] (divides? x divisor)))
	(if (not-any? predicate numbers)
		(println "No multiples of" divisor)
		(filter predicate numbers)
	)
)

(println (random-tens))
