
name := "spark-examples"

organization := "org.collamine"

version := "0.1.0"

scalaVersion := "2.11.12"

sbtVersion in Global := "1.3.12"

resolvers += "Apache HBase" at "https://repository.apache.org/content/repositories/releases"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Maven Repository" at "http://mvnrepository.com/artifact/"

resolvers += "luzhuomi github repo" at "https://raw.githubusercontent.com/luzhuomi/mavenrepo/master/"



scalacOptions += "-deprecation"

libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.2"
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.2"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0" % "provided"
libraryDependencies += "com.github.luzhuomi" %% "scalapderiv" % "0.0.8"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.4" // scala license

libraryDependencies += "com.github.luzhuomi" %% "scalazparsec" % "0.1.4"  // apache license


mergeStrategy in assembly := 
  {
    case PathList("log4j.properties") => MergeStrategy.discard
    case PathList("defaults.yaml", xs @ _*) => MergeStrategy.discard
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case PathList("LICENSE", xs @ _*) => MergeStrategy.discard
    case _ => MergeStrategy.last // leiningen build files
  }


