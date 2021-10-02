package FP

object TailRecur {

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The abs val of %d is %d"
    msg.format(x, abs(x))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def fibonacci(n: Int): Int = {

    @annotation.tailrec
    def goFib(n: Int, store: Int, acc: Int): Int = {
      if (n == 1) acc
      else goFib(n - 1, acc, acc + store)

    }

    goFib(n, 0, 1)

  }

  def formatResult(name:String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d "
    msg.format(name,n, f(n))
  }


  //  def palindrome(str: String): Boolean = {
  //    @annotation.tailrec
  //    def goPal(n:Int, str: String, acc:Boolean): Boolean = {
  //      var rev = str.reverse
  //      var len = str.length
  //
  //      if (n == len) acc
  //      else {
  //        if s
  //      }
  //



  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(factorial(5))
    println(fibonacci(7))
    println(formatFactorial(5))
    println(formatResult("Absolute Value", -6, abs))

  }
}
