(ns exercise2)

(defn only-greater-than-five [x]
  "Filter elemts greater than five."
  	(filter (fn [x] (< 5 x)) x)
  	)

