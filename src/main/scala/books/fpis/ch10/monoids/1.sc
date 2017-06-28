trait Monoid[A] {
  def op(a1: A, a2: A): A
  def zero: A
}

val StringMonoid = new Monoid[String] {
  def op(a1: String, a2: String): String = a1 + a2
  val zero: String = ""
}


def ListMonoid[A] = new Monoid[List[A]] {
  def op(a1: List[A], a2: List[A]): List[A] = a1 ++ a2
  val zero: List[A] = Nil
}

val ListMonoid1 = ListMonoid[Int]

val IntAddition = new Monoid[Int] {
  def op(a1: Int, a2: Int): Int = a1 + a2
  val zero: Int = 0
}

val IntMultiplication = new Monoid[Int] {
  def op(a1: Int, a2: Int): Int = a1 * a2
  val zero: Int = 1
}

val BooleanOr = new Monoid[Boolean] {
  def op(a1: Boolean, a2: Boolean): Boolean = a1 || a2
  val zero: Boolean = false
}


val BooleanAnd = new Monoid[Boolean] {
  override def op(a1: Boolean, a2: Boolean): Boolean = a1 && a2
  override val zero: Boolean = true
}

def opMonoid[A] = new Monoid[Option[A]] {
  override def op(a1: Option[A], a2: Option[A]): Option[A] = a1.orElse(a2)
  override val zero: Option[A] = None
}

val OpMonoid = opMonoid[Int]
OpMonoid.op(Option(1), Option(2))
OpMonoid.op(None, Option(2))
OpMonoid.op(Option(1), OpMonoid.zero)
OpMonoid.op(None, OpMonoid.zero)

def endoMonoid[A] = new Monoid[A => A] {
  override def op(a1: (A) => A, a2: (A) => A): (A) => A = (a) => a2(a1(a))
  override def zero: (A) => A = (a) => a
}

val IntEndo = endoMonoid[Int => Int]

val sumE = IntEndo.op(_ => 2 * _, _ => 3 * _)
val sum2E = IntEndo.op(_ => 2 * _, IntEndo.zero)
val zeroE = IntEndo.zero

sumE(_ => 1)(1)
sum2E(_ => 1)(1)
