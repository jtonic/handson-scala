
object MutableArrayMain extends App {
  val mutableArray = new Array[String](2)
  mutableArray(0)= "Hello"
  mutableArray(1) = " mutable array"
  println(mutableArray)
  mutableArray.foreach(print(_))
}

object ImmutableListMain extends App {
  val immutableList  = List("This is", " a immutable", " collection.")
  immutableList.foreach(print(_))
  println(immutableList.getClass)
}


