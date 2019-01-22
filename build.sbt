val ScalatraVersion = "2.6.4"

organization := "com.example"

name := "My Scalatra Web App"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.7"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "compile;container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

val circeVersion = "0.11.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion
)



enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
enablePlugins(JavaAppPackaging)