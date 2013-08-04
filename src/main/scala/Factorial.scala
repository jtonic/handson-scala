/**
 * Created by jtonic on 7/18/13.
 */

object Factorial {
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if(n <= 0) {
        acc
      } else {
        go(n-1, n * acc)
      }
    go(n, 1)
  }

  def main(args: Array[String]) {
    println ("Factorial of 7 is "  + factorial(7))
  }
}
