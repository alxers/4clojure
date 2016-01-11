#(second (reverse %))

;keithbrown42's solution:
(fn [coll] (second (reverse coll)))

;jafingerhut's solution:
#(last (butlast %))

;balint's solution:
(comp first rest reverse)
