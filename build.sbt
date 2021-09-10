val scalaVer = "3.0.2"

val zioVersion = "1.0.11"
//val zioVersion = "2.0.0-M2" Doesnt work with zio-prelude

lazy val root = project
  .in(file("."))
  .settings(
    name := "uol",
    version := "0.1.0",

    scalaVersion := scalaVer,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-prelude" % "1.0.0-RC6",
      "dev.zio" %% "zio-test" % zioVersion % "test",
      "dev.zio" %% "zio-test-sbt" % zioVersion % "test",
    )
  )
