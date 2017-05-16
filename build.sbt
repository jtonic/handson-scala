name := "handson-scala"

organization := "jtonic"

version := "1.0"

scalaVersion := "2.12.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % "test",
    "org.scalatest" %% "scalatest" % "3.0.3",
//    "org.specs2" %% "specs2-core" % "3.8.4" % "test",
    "com.typesafe.akka" %% "akka-http" % "10.0.6",
    // "org.scalaz" %% "scalaz-core" % scalazVersion,
    // "org.scalaz" %% "scalaz-http" % scalazVersion,
    // "com.h2database" % "h2" % "1.3.173",
     "org.squeryl" %% "squeryl" % "0.9.8"
)

