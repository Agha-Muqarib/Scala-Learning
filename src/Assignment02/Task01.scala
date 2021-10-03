package Assignment02

import scala.util.Random
import scala.collection.mutable._
import scala.language.postfixOps

// Generate a list of 15 integer numbers generated randomly from 50 - 500. After making the
//complete list check if each element is prime or not, if its a prime number then put it into an iterator. Finally
//sort them in ascending order and put them into a Map. Where each key should be the element location
//of the number. Bonus point for anyone who does not uses for loop.


object Task01 {

  def randomPrimeIterator(n: Int) = {

  // Creating a list of random numbers

    var randomList = new ListBuffer[Int]()
    var i = 0
    while (i<n) {
      var x:Int = scala.util.Random.between(50:Int ,500:Int)
      randomList += x
      i += 1
      }
    println(randomList.toSeq)

  // Checking if prime or not

    def isPrime(j :Int) : Boolean = {
      if (j <= 1)
        false
      else if (j == 2)
        true
      else
        !(2 to (j-1)).exists(x => j % x == 0)
    }

    var lst = new ArrayBuffer[Int]()
    // var itr = Iterator()
    randomList.foreach(j => if (isPrime(j)) {
      // println(j)
      lst += j })
    // println(lst.toSeq)

    var sortedItr = lst.toIterator
//    println(sortedItr.toSeq)

  // Converting sorted iterator map

    val sortedMap = scala.collection.mutable.Map[Int, Int]()
    var index = 0
    while (sortedItr.hasNext) {
      val value = sortedItr.next()
      sortedMap += (index -> value)
      index += 1
    }

    println(sortedMap)

  }

// Driver Code

  def main(args: Array[String]): Unit ={
    randomPrimeIterator(15)
  }

}


