//package Assignment02
//
//import scala.collection.mutable._
//import scala.collection.immutable._
//
//object Task04 {
//
//  def isEven(n:Int): Boolean = {
//    if (n%2==0) true
//    else false
//  }
//
//  def evenNumbers(array: Array[Int]):Unit = {
//    @annotation.tailrec
//    def helper(n:Int, array: Array[Int], acc:Array[Int]):Unit = {
//      if (n<1) acc.length
//      else helper(n + 1, array, forAcc(array))
//
//      def forAcc(array: Array[Int]): Array[Int] ={
//        var arr1 = new Array[Int](n)
//        arr1.foreach(j => if (isEven(j) == true) arr1 :+ j)
//        arr1.toArray
//        arr1
//      }
//    }
//
//    helper(0,array,Array())
//  }
//
////  driver Code
//
//  def main(args: Array[String]){
//    val array = Array(2,3,4,5,6)
//    println(evenNumbers(array))
//  }
//}
