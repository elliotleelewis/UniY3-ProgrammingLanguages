(defn predict-balance [initial interestRate years]
	(* initial (Math/pow (inc interestRate) years))
)

(defn years-to-target [initial target interestRate]
	(Math/ceil (/ (- (Math/log target) (Math/log initial)) (Math/log (inc interestRate))))
)

(defn target-years [initial target interestRate]
	(range 0 (inc (years-to-target initial target interestRate)))
)

(defn print-target [initial target interestRate]
	(doseq
		[i (target-years initial target interestRate)]
		(println (str "Year " i ": " (predict-balance initial interestRate i)))
	)
)

(println (predict-balance 300 0.005 10))
(println (years-to-target 300 400 0.005))
(println (target-years 100 105 0.005))
(print-target 100 105 0.005)
