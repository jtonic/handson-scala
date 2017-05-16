/**
  * Created by antonelpazargic on 19/07/16.
  */

class Customer(val name:String, val discountCode:String="N") {
  def discounts(): List[Int] = List(5)

  override def toString() = "Applied discounts: " + discounts.mkString(" ", "%, ", "% ")
}
