package Assignment02

import scala.collection.immutable._
import scala.collection.mutable._

object Task02 {

  def CharArray(start: Int): List [Char] ={

    @annotation.tailrec
    def helper(start:Int, end:Int, acc:List[Char]): List[Char] = {
//      var n: Int = start
      if (start == end) acc
      else helper(start+1,123, acc :+ start.toChar)
    }

    helper(start,123,List())
  }

//Driver code

  def main(args: Array[String]): Unit ={
    println(CharArray(97))

  }

}
