import AssemblyKeys._

assemblySettings

name := "spark-ml-examples"

version := "0.1"

scalaVersion := "2.11.12"

sbtVersion in Global := "1.3.0"

crossSbtVersions := Vector("0.13.16", "1.3.0")


libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.0" % "provided"
