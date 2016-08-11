name := "handson-scala"

organization := "jtonic"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.11" % "test",
    "org.specs2" %% "specs2-core" % "3.8.4" % "test",
    "com.typesafe.akka" %% "akka-actor" % "2.4.8"
    // "org.scalaz" %% "scalaz-core" % scalazVersion,
    // "org.scalaz" %% "scalaz-http" % scalazVersion,
    // "com.h2database" % "h2" % "1.3.173",
    // "org.squeryl" % "squeryl_2.10" % "0.9.5-6"
)

