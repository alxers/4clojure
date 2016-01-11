(fn [x] (nth x (- (count x) 1)))

;keithbrown42's solution:
(fn [coll] (first (reverse coll)))

;chouser's solution:
#(peek(vec %))

;seba's solution:
#(first (reverse %))
