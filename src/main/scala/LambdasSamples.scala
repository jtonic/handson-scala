/**
 * Created by jtonic on 7/18/13.
 */
object LambdasSamples {

  def main(args: Array[String]) {
    val lessThan = (a: Int, b:Int) => a < b

    val result = lessThan.apply(1, 2)
    val result1 = lessThan(1, 2)
    println("Result: " + result)
    println("Result1: " + result1)
  }

}
