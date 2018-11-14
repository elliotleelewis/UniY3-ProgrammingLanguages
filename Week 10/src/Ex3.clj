(defn filter-strings [vec]
	(if (= (count vec) 0)
		(println "One or more strings must be provided")
		(filter (fn [str] (> (count str) 5)) vec)
	)
)

(println (filter-strings []))
(println (filter-strings ["Apple" "Banana" "Grape" "Orange" "Pear"]))
