import SonatypeKeys._

// Your project orgnization (package name)
organization := "com.kreattiewe"

// Your profile name of the sonatype account. The default is the same with the organization
sonatypeProfileName := "com.kreattiewe"

name := """case-class-mapper"""

version := "1.0.1"

scalaVersion := "2.11.6"

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false


// Change this to another test framework if you prefer
libraryDependencies ++= {
  Seq(
    "org.scala-lang" % "scala-reflect" % "2.11.6",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  )
}

pomExtra := (
  <url>https://github.com/mrkaspa/CaseClassMapper</url>
    <licenses>
      <license>
        <name>BSD-style</name>
        <url>http://www.opensource.org/licenses/bsd-license.php</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>github.com/mrkaspa/CaseClassMapper.git</url>
      <connection>scm:git:git@github.com:mrkaspa/CaseClassMapper.git</connection>
    </scm>
    <developers>
      <developer>
        <id>mrkaspa</id>
        <name>Michel Perez</name>
        <url>http://mrkaspa.com</url>
      </developer>
    </developers>)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

