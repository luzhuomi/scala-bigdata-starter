import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
	def main(args: Array[String]) {

		val conf = new SparkConf().setAppName("Wordcount Application")
		val sc = new SparkContext(conf)
		val textFile = sc.textFile("hdfs://localhost:9000/input/")
		val counts = textFile.flatMap(line => line.split(" "))
			.map((word:String) => (word, 1))
			.reduceByKey(_ + _)
		counts.saveAsTextFile("hdfs://localhost:9000/output/")

	}
}

/*
/opt/spark-1.4.1-bin-hadoop2.6/bin/spark-submit target/scala-2.11/spark-examples_2.11-0.1.0.jar
*/