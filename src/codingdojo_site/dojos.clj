(ns codingdojo-site.dojos)

(def dojos
  { :prague {
             :name "Coding Dojo Prague"
             :repository "https://github.com/codingdojoprague/coding-dojo"
             :events "http://srazy.info/coding-dojo-prague/terminy"
             :organizers [
                          ["@jirkapenzes" "http://twitter.com/jirkapenzes"]
                          ["@alesroubicek" "http://twitter.com/alesroubicek"]
                          ["@MarianSchubert" "https://twitter.com/marianschubert"]
                          ["@matejhron" "http://twitter.com/matejhron"]] }

    :gmcolomouc {
                 :name "GMC Coding Dojo Olomouc"
                 :events "http://srazy.info/gmc-coding-dojo/terminy"
                 :repository "https://bitbucket.org/mcBIG/gmc-coding-dojo"
                 :organizers [
                              ["@mcBigCz" "https://twitter.com/mcBIGcz"]
                              ["@TomasLatal" "https://twitter.com/TomasLatal"]]}

    :pardubice {
                :name "Coding Dojo Pardubice"
                :repository "https://github.com/CodingDojoPardubice/CodingDojo"
                :events "http://srazy.info/coding-dojo-pardubice/terminy"
                :organizers [
                             ["@EmilRezanina" "https://twitter.com/EmilRezanina"]
                             ["@MariskaMartin" "https://twitter.com/MariskaMartin"]]}

    :jihlava {
              :name "GDG Coding Dojo Jihlava"
              :events "http://www.gug.cz/cs/akce/gdg-coding-dojo-jihlava"
              :organizers [
                           ["@milanlempera" "https://twitter.com/milanlempera"]]}})
(defn all [] dojos)
