name := "blog"

version := "1.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "commons-codec" % "commons-codec" % "1.9",
  "mysql" % "mysql-connector-java" % "5.1.28",
  "org.clapper" %% "markwrap" % "1.0.2"
)

lessEntryPoints := Nil
lessEntryPoints <<= baseDirectory(_ / "private" / "bootstrap" / "less" ** "bootstrap.less")

play.Project.playScalaSettings
