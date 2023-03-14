{:user {:dependencies [[com.github.liquidz/antq "RELEASE"]
                       [org.slf4j/slf4j-simple "RELEASE"]]
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        :resource-paths ["C:/Users/twalter/scoop/apps/temurin19-jdk/19.0.2-7/lib/src.zip"]

        :local-repo "c:/repo"}
 
 :repl {:dependencies [[nrepl/nrepl "1.0.0"]]

        :plugins [[refactor-nrepl/refactor-nrepl "3.6.0"]
                  [cider/cider-nrepl "0.30.0"]
                  [mx.cider/enrich-classpath "1.9.0"]]        
        :middleware [cider.enrich-classpath/middleware]
        :enrich-classpath {:classifiers #{"sources" "javadoc"}}

        :resource-paths ["C:/Users/twalter/scoop/apps/temurin19-jdk/19.0.2-7/lib/src.zip"]
        
        :local-repo "c:/repo"}}
