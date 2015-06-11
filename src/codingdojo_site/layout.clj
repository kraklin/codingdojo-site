(ns codingdojo-site.layout
  (:require [codingdojo-site.dojos :as dojos]
            [codingdojo-site.content :as content]
            [hiccup.core :refer :all]
            [hiccup.page :refer :all]))

(def includes [(include-js "/js/google-analytics.js")
               (include-css "//fonts.googleapis.com/css?family=Gentium+Book+Basic")
               (include-css "/css/design.css")])

(def header [:div { :id "header" } [:h1 "Coding Dojo's"]])

(def about
  [:div { :id "about" }
   (map #(vector :p %) (content/about))])

(defn- dojo-section [dojo]
  [:div { :class "dojo" }
   [:h2 (:name dojo)]
   [:span
    [:a { :href (:events dojo) } "Termíny setkání" ] " | "
    [:a { :href (:repository dojo) } "Repozitory" ]] [:br]
   [:span "Organizátoři: "
    (for [[org-name profile-url] (:organizers dojo)]
      (list [:a { :href profile-url } org-name] " "))]])

(def dojos
  [:div { :id "dojos" }
   [:h1 "Dojo list"]
   (for [[_ dojo] (dojos/all)]
     (dojo-section dojo))
   (map #(vector :p %) (content/new-dojo))])

(defn vec->url [[title link]]
  [:a {:href link} title])

(def links
  [:div { :id "links" }
   [:h1 "Odkazy"]
   [:ul
    (for [[title link] (content/links)]
      [:li (vec->url [title link])])]])

(def media
  [:div { :id "photos" }
   [:h1 "Jak to vypadá?"]
   (for [[image url] (content/photos)]
     [:a { :href url }
      [:img { :src image }]])
   [:div { :class "videos" }
    (apply str (content/videos))]])

(def videos [:div { :id "videos" }
             (apply str (content/videos)) ])

(def hashtag
  [:div { :id "hashtag" }
   (vec->url (content/hashtag))])

(def footer [:div { :id "footer" }
             (apply str (content/footer))])

(defn default-page []
  (html5 {:lang "en"}
         `[:head
           [:title "CodingDojo.cz"]
           ~@includes]

         [:body
          [:div { :class "content-wrapper" }
           header about dojos links media hashtag footer]]))
