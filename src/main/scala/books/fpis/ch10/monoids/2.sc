trait Monoid[A] {
  def op(a1: A, a2: A): A
  def zero: A
}

val StringMonoid = new Monoid[String] {
  def op(a1: String, a2: String): String = a1 + a2
  val zero: String = ""
}

val words = List("one", "two", "three")
val someWords = List("one", StringMonoid.zero)

words.foldLeft(StringMonoid.zero)(StringMonoid.op)
words.foldRight(StringMonoid.zero)(StringMonoid.op)

someWords.foldLeft(StringMonoid.zero)(StringMonoid.op)
someWords.foldRight(StringMonoid.zero)(StringMonoid.op)

