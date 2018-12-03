(defn get-divisors [n]
	(range 2 (inc (Math/sqrt n)))
)

(defn divides? [n x]
	(== (mod n x) 0)
)

(defn no-divisors? [n]
	(not-any? (fn [x] (divides? n x)) (get-divisors n))
)

(defn is-prime? [n]
	(if (== n 1)
		false
		(no-divisors? n)
	)
)

(defn prim-seq [from to]
	(filter is-prime? (range from (inc to)))
)

(defn print-top-primes [from to]
	(def seq (reverse (prim-seq from to)))
	(doall (map println seq))
	(let [total (reduce + seq)]
		(println "Total:" total)
	)
)

(print-top-primes 50 100)
(print-top-primes 7 11)
