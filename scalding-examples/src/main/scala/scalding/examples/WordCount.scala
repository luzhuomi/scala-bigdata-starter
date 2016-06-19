package jobs

import com.twitter.scalding._
import com.twitter.scalding.Args

class WordCount(args: Args) extends Job(args) {
	TypedPipe.from(TextLine(args("input")))
	.flatMap { line => line.split("""\s+""") }
	.groupBy { word => word }
	.size
	.write(TypedTsv(args("output")))
}