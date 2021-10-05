package Assignment03

object Exercise02 {

  def zipList(list1:List[Int], list2:List[Int]): Unit = {
    println(list1)
    println(list2)

    val equation = (a:Int, b:Int, c:Int) => (x:Int) => a*(math.pow(x,2)) + b*x + c

    val x = (list1, list2).zipped.map(equation(3,5,7))
    val y = x.zipWithIndex
    println(y)
  }

  def main(args: Array[String]){}
    println(zipList(List(3,4,5),List(1,2,3)))
}
