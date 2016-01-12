(fn [str] (clojure.string/replace str #"[^A-Z]" ""))

;keithbrown42's solution:
(fn [s] (apply str (filter #(Character/isUpperCase %) s)))

;hypirion's solution:
#(->>
   (re-seq #"[A-Z]" %)
   (apply str))

;jafingerhut's solution:
#(apply str (re-seq #"[A-Z]+" %))
