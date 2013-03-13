organization := "edu.washington.cs.knowitall.chunkedextractor"

name := "chunkedextractor"

description := "Wrapper and implementation for extractors of chunked sentences."

version := "1.0.2"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "edu.washington.cs.knowitall" %% "openregex-scala" % "1.0.4",
    "edu.washington.cs.knowitall" % "reverb-core" % "1.4.1",
    "edu.washington.cs.knowitall.nlptools" %% "nlptools-core" % "2.4.0",
    "edu.washington.cs.knowitall.nlptools" %% "nlptools-chunk-opennlp" % "2.4.0",
    "edu.washington.cs.knowitall.nlptools" %% "nlptools-stem-morpha" % "2.4.0",
    "junit" % "junit" % "4.11",
    "org.specs2" %% "specs2" % "1.12.3")

licenses := Seq("Academic License" -> url("http://reverb.cs.washington.edu/LICENSE.txt"))

homepage := Some(url("http://github.com/knowitall/chunkedextractor"))

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <scm>
    <url>https://github.com/knowitall/chunkedextractor</url>
    <connection>scm:git://github.com/knowitall/chunkedextractor.git</connection>
    <developerConnection>scm:git:git@github.com:knowitall/chunkedextractor.git</developerConnection>
    <tag>HEAD</tag>
  </scm>
  <developers>
   <developer>
      <name>Michael Schmitz</name>
    </developer>
  </developers>)