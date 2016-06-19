package scalding.examples
// Hadoop
import org.apache.hadoop

// Scalding
import com.twitter.scalding.Tool

/**
 * Entrypoint for Hadoop to kick off the job.
 *
 * Borrowed from com.twitter.scalding.Tool
 */
 object JobRunner {
 	def main(args : Array[String]) {
 		hadoop.util.ToolRunner.run(new hadoop.conf.Configuration, new Tool, args)
 	}
 }

