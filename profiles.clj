{:user {:dependencies [[com.github.liquidz/antq "2.11.1276"]
                       [org.slf4j/slf4j-api "2.0.17"]
                       [org.slf4j/slf4j-simple "2.0.17"]]
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/current/lib/src.zip"
                         "C:/Users/sib_twalter/scoop/apps/zulufx-jdk/current/lib/src.zip"
                         "/usr/lib/jvm/default/lib/src.zip"]

        ;;:local-repo "c:/repo"
        }
 
 :repl {:dependencies [[nrepl/nrepl "1.3.1"]]

        :plugins [[cider/cider-nrepl "0.53.0"]
                  [cider/orchard "0.31.1"]
                  [refactor-nrepl/refactor-nrepl "3.10.0"]
                  [mx.cider/enrich-classpath "1.19.3"]]
        :middleware [cider.enrich-classpath/middleware]
        :enrich-classpath {:classifiers #{"sources" "javadoc"}}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/current/lib/src.zip"
                         "C:/Users/sib_twalter/scoop/apps/zulufx-jdk/current/lib/src.zip"
                         "/usr/lib/jvm/default/lib/src.zip"]
        
        ;;:local-repo "c:/repo"
        }}
