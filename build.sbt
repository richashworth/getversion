import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.richashworth",
      scalaVersion := "2.12.2",
      mainClass in assembly := Some("com.richashworth.getversion.Main"),
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "GetVersion",
    libraryDependencies += scalaTest % Test
  )
