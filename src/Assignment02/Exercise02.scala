package Assignment02

object Exercise02 {

  var mutSet = Set(1, 2, 3, 4, 5)
  mutSet += 7

  println(s"""Mutability in sets\n""")

  print(mutSet)
  println(mutSet(7))


  var mutMap = collection.mutable.Map("Name" -> "Agha Muqarib", "RollNumber" -> "18B-080-SE")
  mutMap += ("Section" -> "A")

  println(s"""Mutability in Maps\n""")

  println(mutMap)


  def main(args: Array[String]): Unit = {

    //    println(ArrayWays())
  }
}
