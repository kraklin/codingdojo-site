(ns codingdojo-site.handler
  (:use ring.util.response)
  (:require [codingdojo-site.layout :as layout]
            [codingdojo-site.dojos :as dojos]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
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
  (route/resources "/")
  (route/not-found (layout/default-page)))

(def app
  (wrap-defaults app-routes site-defaults))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "5000"))]
    (jetty/run-jetty app-routes {:port port})))
