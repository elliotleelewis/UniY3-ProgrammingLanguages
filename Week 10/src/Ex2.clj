(defn has-ten-multiple [vec]
	(= (some (fn [x] (== (mod x 10) 0)) vec) true)
)

(println (has-ten-multiple [11 39 42]))
(println (has-ten-multiple [11 39 40]))
