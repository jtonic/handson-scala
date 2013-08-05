/**
 * Created by jtonic on 8/5/13.
 */


object ApplyMethods extends App {

  class Foo {
    def add(a: Int, b: Int) = a + b
  }

  object FooMaker {
    def apply() = new Foo
  }

  val f = FooMaker()
  val res = f.add(1, 1)

  println("res = " + res)

}