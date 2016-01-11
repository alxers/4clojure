#(get (vec %1) %2)

;keithbrown42's solution:
(fn [coll n] (first (drop n coll)))

;chouser's solution:
#(get (vec %) %2)