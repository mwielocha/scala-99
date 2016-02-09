lazy val root = (project in file(".")).
  settings(
    name := "scala-99",
    version := "1.0",
    scalaVersion := "2.11.5"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"