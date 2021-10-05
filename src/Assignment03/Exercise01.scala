package Assignment03

object Exercise01 {

  val equation = (a:Int, b:Int, c:Int) => (x:Int) => a*(math.pow(x,2)) + b*x + c

  def main(args: Array[String]){
    val f = equation(3,5,7)
    val list = List.fill(5)(util.Random.between(-3,3))
    println(list)
    val mapList = list.map(f(_))
    println(mapList)


//    val config = (list:Map[String,List[Double]]) => (listMap:Map[String,List[Double]]) => Map["a" -> list, "b" -> mapList]

  }
}
