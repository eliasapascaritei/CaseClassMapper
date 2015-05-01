name := """CaseClassMapper"""

version := "1.0"

scalaVersion := "2.11.6"

// Change this to another test framework if you prefer
libraryDependencies ++= {
  Seq(
    "org.scala-lang" % "scala-reflect" % "2.11.6",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  )
}

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

