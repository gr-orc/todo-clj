(ns todo-clj.handler.main
  (:require [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]
            [todo-clj.util.resposnse :as res]))

(defn home-view
  [req]
  "<h1>home page</h1>
   <a href=\"/todo\">TODOs</a>")

(defn home
  [req]
  (-> (home-view req)
      res/response
      res/html))

(defroutes main-routes
  (GET "/" _ home)
  (route/not-found "<h1>not found</h1>"))
