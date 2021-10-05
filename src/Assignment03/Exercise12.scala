package Assignment03

object Exercise12 {

  def implicitDT(int1:Int, int2:Int):Unit = {

    implicit val x = int1.toString
    implicit val y = int2.toString

    def concat(implicit x:String, y:String): Unit = {
      println(x+y)
    }
      concat(x,y)
  }

  def main(args: Array[String]): Unit ={
    implicitDT(2,3)
  }
}
