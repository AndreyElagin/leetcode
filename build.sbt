ThisBuild / name := "leetcode"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1"

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-explaintypes",
  "-feature",
  "-language:higherKinds",
  "-unchecked",
  "-Xcheckinit",
  "-Xlint:adapted-args",
  "-Xlint:infer-any",
  "-Xlint:nullary-override",
  "-Xlint:nullary-unit",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)