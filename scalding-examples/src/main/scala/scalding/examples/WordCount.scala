package scalding.examples

import com.twitter.scalding._
import com.twitter.scalding.Args

class WordCount(args: Args) extends Job(args) {
	TypedPipe.from(TextLine(args("input")))
	.flatMap { line => line.split("""\s+""") }
	.groupBy { word => word }
	.size
	.write(TypedTsv(args("output")))
}


/* 
yarn jar target/scala-2.11/scalding-examples-assembly-0.1.0.jar scalding.examples.WordCount --hdfs --input /input/ --output /output/
*/