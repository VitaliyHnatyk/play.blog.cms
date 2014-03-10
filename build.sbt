name := "blog"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "commons-codec" % "commons-codec" % "1.9",
      "mysql" % "mysql-connector-java" % "5.1.28",
      "org.clapper" %% "markwrap" % "0.5.5"
)   
   

play.Project.playScalaSettings
