{:user {:dependencies [[com.github.liquidz/antq "2.8.1185"]
                       [org.slf4j/slf4j-api "2.0.13"]
                       [org.slf4j/slf4j-simple "2.0.13"]]
        :aliases {"outdated" ["run" "-m" "antq.core"]}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/22.28.91/lib/src.zip"
                         "C:/Users/sib_twalter/scoop/apps/zulufx-jdk/22.28.91/lib/src.zip"
                         "/home/util/opt/zulu21.30.15-ca-jdk21.0.1-linux_x64/lib/src.zip"]

        :local-repo "c:/repo"}
 
 :repl {:dependencies [[nrepl/nrepl "1.1.1"]]

        :plugins [[cider/cider-nrepl "0.47.1"]
                  [cider/orchard "0.23.3"]
                  [refactor-nrepl/refactor-nrepl "3.10.0"]
                  [mx.cider/enrich-classpath "1.19.0"]]
        :middleware [cider.enrich-classpath/middleware]
        :enrich-classpath {:classifiers #{"sources" "javadoc"}}

        :resource-paths ["C:/Users/Utilisateur/scoop/apps/zulufx-jdk/22.28.91/lib/src.zip"
                         "C:/Users/sib_twalter/scoop/apps/zulufx-jdk/22.28.91/lib/src.zip"
                         "/home/util/opt/zulu21.30.15-ca-jdk21.0.1-linux_x64/lib/src.zip"]
        
        :local-repo "c:/repo"}}
