package Assignment03

object Exercise09  {

  def Apply(array:Array[Int]): Int ={
    var sum = array.reduce(_+_)
    sum
  }

  def main(args:Array[String]) {
    println(Apply(Array(1, 2, 3, 4, 5)))
  }
}