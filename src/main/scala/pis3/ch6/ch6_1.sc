class Rational(n: Int, d: Int) {
  require(d > 0, "Denominator must be a positive integer.")

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  override def toString: String = numer + "/" + denom


  def + (that: Rational): Rational = new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

  def + (i: Int): Rational = new Rational(this.numer + i * this.denom, this.denom)

  def - (that: Rational): Rational = new Rational(this.numer * that.denom - this.denom * that.numer, this.denom * that.denom)

  def - (i: Int): Rational = new Rational(this.numer - i * this.denom, this.denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(this.numer * i, this.denom)

  def < (that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

val r1 = new Rational(1, 2)

val r2 = new Rational(2, 3)

val r3 = new Rational(5)

val r4 = new Rational(66, 42)

val r5 = r1 + r2 * r3

val r6 = new Rational(1, 2) + 1

implicit def intToRational(i: Int): Rational = new Rational(i)

val r7 = 1 + new Rational(1, 2)

r1 + r2
r1 * r2

r1 numer

r1 denom

r1 < r2

r3 < r2







