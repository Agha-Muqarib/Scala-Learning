package Assignment02

import scala.collection.mutable._

object Task03 {

  def arraySum(array1: Array[Double], array2: Array[Double]): ArraySeq[Double] = {
    var summedArray = (array1,array2).zipped.map(_+_)
    println(summedArray.toSeq)
    summedArray
  }


  def main(args: Array[String]) {

//    val array1 = new Array[Double](3)
    val array1 = Array(1.0, 2.0, 3.0)

//    val array2 = new Array[Double](3)
    val array2 = Array(4.0, 5.0, 6.0)

    arraySum(array1, array2)
  }
}