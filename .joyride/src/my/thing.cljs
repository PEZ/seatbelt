(ns my.thing
  (:require ["vscode" :as vscode]))

(defn- button-label [n]
  (case n
    0 "Awesome!"
    1 "OK"
    2 "Roger that"
    "NYIP"))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn init! []
  (vscode/window.showInformationMessage "My Thing is activated now." (button-label 0)))