(defn fact [x]
	(def listn (range 2 (inc x)))
	(reduce * listn)
)

(println (fact 5))
(println (fact 6))
