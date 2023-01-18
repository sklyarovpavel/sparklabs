package main.scala

import org.apache.spark.sql.SparkSession

object SklyarovLab01 {
    //Внутри класса
    def main(args: Array[String]): Unit = {
        // Внутри метода
        val spark = SparkSession.builder()
            .appName("Pavel_Sklyarov_lab01")
            .getOrCreate()
    }
}