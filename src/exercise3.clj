(ns exercise3)

(defn fibonacci [x]
	"Hace el calculo recursivo fibonacci."
	(if (= x 0) 
		0 
		(if (= x 1) 
			1
			(+ (fibonacci (- x 1)) (fibonacci (- x 2)))
			)
		)
	)