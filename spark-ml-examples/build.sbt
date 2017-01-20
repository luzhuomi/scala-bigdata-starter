import AssemblyKeys._

assemblySettings

name := "spark-ml-examples"

version := "0.1"

// scalaVersion := "2.11.8"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.6.1"
