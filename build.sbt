
lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.0"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    version := "1.0",
    scalaVersion := "$scala_version$",
    libraryDependencies += scalatest % "test"    
  )

