package Assignment02

object Task05{

  def buildMap[A,B](data: Seq[A],f: A=>B):Map[A,B] = {
    return(data zip data.map(x=>f(x))).toMap
  }

  def main(args: Array[String]): Unit = {

    def isEven(n:Int):Boolean = {
      if(n%2==0) true
      else false
    }
    val seq: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9,10)
    val finalMap = buildMap[Int,Boolean](seq,isEven)
    println(finalMap)
  }
}