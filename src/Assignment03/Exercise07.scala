package Assignment03

object Exercise07 {

  def addFive(n:Int):Int = n+5

  def mapWithVector(vec:Vector[Int]) = {
     vec.map(addFive(_))
  }

  def mapWithSet(set:Set[Int]):Set[Int] = {
    set.map(addFive(_))
  }

  def main(args: Array[String]): Unit ={
    println(mapWithVector(Vector(4,5,6,7)))
    println(mapWithSet(Set(1,2,3,4)))
  }

}
