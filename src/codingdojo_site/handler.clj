(ns codingdojo-site.handler
  (:use ring.util.response)
  (:require [codingdojo-site.layout :as layout]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn dojo-by-city [city]
  (if (keyword? city)
    (city (dojos/all))
    (dojo-by-city (keyword city))))

(defn redirect-to-dojo [city]
  (let [dojo (dojo-by-city city)]
        (if dojo
          (redirect (:events dojo))
          (layout/default-page))))

(defroutes app-routes
  (GET "/" []  (layout/default-page))
  (GET "/:city" [city] (redirect-to-dojo city))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
