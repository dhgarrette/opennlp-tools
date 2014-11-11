name := "opennlp-tools"

version := "1.5.3"

organization := "org.apache.opennlp"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "net.sf.jwordnet" % "jwnl" % "1.3.3",
  "org.apache.opennlp" % "opennlp-maxent" % "3.0.3",
  "org.osgi" % "org.osgi.compendium" % "4.2.0",
  "org.osgi" % "org.osgi.core" % "4.2.0")
