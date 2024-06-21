package com.example.analytics

import org.apache.spark.sql.SparkSession

object SparkProcessor {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark Processor")
      .getOrCreate()

    val data = spark.read.json("hdfs://path/to/data")
    data.createOrReplaceTempView("tweets")

    val sentimentData = spark.sql("SELECT text, sentiment FROM tweets")
    sentimentData.write.format("mongo").mode("append").save()

    spark.stop()
  }
}
