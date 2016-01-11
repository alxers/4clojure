#(reduce (fn [i _] (inc i)) 0 %)

;hypirion's solution:
(fn [coll]
  ((fn [coll n]
     (if (empty? coll)
       n
       (recur (rest coll) (inc n))))
   coll 0))

;chouser's solution:
reduce #(do %2 (+ 1 %)) 0
