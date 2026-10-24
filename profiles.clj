{:user {:dependencies [[com.github.liquidz/antq "2.11.1276"]
                       [org.slf4j/slf4j-api "2.0.20"]
                       [org.slf4j/slf4j-simple "2.0.20"]]
        
        :aliases {"outdated" ["run" "-m" "antq.core"]}}

 :repl {:dependencies [[nrepl/nrepl "1.8.0"]]

        :plugins [[cider/cider-nrepl "0.63.1"]
                  [cider/orchard "0.46.0"]
                  [refactor-nrepl/refactor-nrepl "3.14.0"]]}}
