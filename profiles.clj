{:user {:dependencies [[com.github.liquidz/antq "RELEASE"]
                       [org.slf4j/slf4j-simple "RELEASE"]]
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/21.32.17/lib/src.zip"]

        :local-repo "c:/repo"}
 
 :repl {:dependencies [[nrepl/nrepl "1.1.1"]]

        :plugins [[cider/cider-nrepl "0.45.0"]
                  [cider/orchard "0.21.0"]
                  [refactor-nrepl/refactor-nrepl "3.9.1"]
                  [mx.cider/enrich-classpath "1.19.0"]]
        :middleware [cider.enrich-classpath/middleware]
        :enrich-classpath {:classifiers #{"sources" "javadoc"}}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/21.32.17/lib/src.zip"]
        
        :local-repo "c:/repo"}}
