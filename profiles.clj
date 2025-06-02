{:user {:dependencies [[com.github.liquidz/antq "2.11.1276"]
                       [org.slf4j/slf4j-api "2.0.17"]
                       [org.slf4j/slf4j-simple "2.0.17"]]
        
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        ;;:local-repo "c:/repo"
        }
 
 :repl {:dependencies [[nrepl/nrepl "1.3.1"]]

        :plugins [[cider/cider-nrepl "0.56.0"]
                  [cider/orchard "0.35.0"]
                  [refactor-nrepl/refactor-nrepl "3.11.0"]]
        
        ;;:local-repo "c:/repo"
        }}
