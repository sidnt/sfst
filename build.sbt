import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.0.1"

lazy val root = (project in file("."))
  .settings(
    name := "sfst",
    libraryDependencies ++= Seq(
      zio
    )
  )
