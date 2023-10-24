{:user {:dependencies [[com.github.liquidz/antq "RELEASE"]
                       [org.slf4j/slf4j-simple "RELEASE"]]
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulu-jdk/21.30.15/lib/src.zip"]

        :local-repo "c:/repo"}
 
 :repl {:dependencies [[nrepl/nrepl "1.0.0"]]

        :plugins [[cider/cider-nrepl "0.40.0"]
                  [cider/orchard "0.17.0"]
                  [refactor-nrepl/refactor-nrepl "3.9.0"]
                  [mx.cider/enrich-classpath "1.18.2"]]
        :middleware [cider.enrich-classpath/middleware]
        :enrich-classpath {:classifiers #{"sources" "javadoc"}}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulu-jdk/21.30.15/lib/src.zip"]
        
        :local-repo "c:/repo"}}
