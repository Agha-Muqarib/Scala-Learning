package Assignment02

object Exercise04 {

  def sum(x: Int):Int = x+1

  def highOrderArray( f: Int) = {

  var array = Array(1,2,3,5,7,8,9,0)
  array.apply(f)
  }

  //Driver Code

  def main(args: Array[String]): Unit ={
      println(highOrderArray(sum(1)))
  }


}

