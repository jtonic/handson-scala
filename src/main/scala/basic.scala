/**
 * Created by jtonic on 8/5/13.
 */

object PartialFunctions extends App {
  def adder(m: Int, n: Int) = m + n

  val addTwo = adder(2, _: Int)
  val two = addTwo(3)
  println("two = " + two)
}

object CurriedFunctions extends App {

  def multiply(a: Int)(b: Int) = a * b

  println("multiply(1)(2) = " + multiply(1)(2))

  val multiplyByTwo = multiply(2) _

  println("multiplyByTwo(3) = " + multiplyByTwo(3))

  val adder: (Int, Int) => Int = (a, b) => a + b

}

object VariableParamLength extends App {
  def capitalize(args: String*) = {
    args.map {
      arg =>
        arg.toUpperCase
    }
  }

  val a = "Antonel"
  val l = "Liviu"
  val res = capitalize(a, l)
  res.foreach {
    i =>
      println("it = " + i)
  }
}

object Clazzez extends App {

  class Calculator {
    val brand: String = "HP"

    def add(m: Int, n: Int) = m + n
  }

  class BasicCalculator(val brand: String) {
    val color: String = if (brand.equalsIgnoreCase("HP")) {
      "black"
    } else {
      "white"
    }

    def add(m: Int, n: Int) = m + n
  }

  val basicCal = new BasicCalculator("hp")
  println("basicCal.brand = " + basicCal.brand)
  println("basicCal.color = " + basicCal.color)

  val calc = new Calculator
  println("calc.brand = " + calc.brand)
  println("calc.add(1, 2) = " + calc.add(1, 2))
}


object FunctionsAndMethods extends App {

  class C {
    var acc = 0

    def minc = {
      acc += 1
    }

    val finc = {
      () => acc += 1
    }
  }

  val c = new C
  val mInv = c.minc
  println("mInv = " + mInv)
  println("c.acc 1 = " + c.acc)

  val f = c.finc
  println("f = " + f)
  println("c.acc 2 = " + c.acc)

  val result = f()
  println("f() = " + result)
  println("c.acc 3 = " + c.acc)

}

class AbstractClassesMain extends App {
  abstract class Shape {
    def getArea(): Double
  }

  class Circle (val r: Int) extends Shape {
    def getArea(): Double = Math.PI * r * r / 2
  }

  val c = new Circle(10)
  println("c.getArea() = " + c.getArea())

}





