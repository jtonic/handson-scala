/**
 * Created by jtonic on 8/4/13.
 */

object PriceCalculatorWithoutMonads {
  import Stubs._

  case class PriceState(productId: String, stateCode: String, price: Double)

  def findBasePrice(productId:String, stateCode: String): PriceState = {
    val basePrice  = findTheBasePrice(productId: String)
    PriceState(productId, stateCode, basePrice)
  }

  def applyStateSpecificDiscount(ps: PriceState): PriceState = {
    val stateDiscount = findStateSpecificDiscount(ps.productId, ps.stateCode)
    ps.copy(price = ps.price - stateDiscount)
  }

  def applyProductSpecificDiscount(ps: PriceState): PriceState = {
    val productDiscount = findProductSpecificDiscount(ps.productId, ps.stateCode)
    ps.copy(price = ps.price - productDiscount)
  }

  def applyTax(ps: PriceState): PriceState = {
    val tax = calculateTax(ps.productId, ps.price)
    ps.copy(price = ps.price + tax)
  }

  def calculatePrice(productId: String, stateCode: String): Double = {
    val a = findBasePrice(productId, stateCode)
    val b = applyStateSpecificDiscount(a)
    val c = applyProductSpecificDiscount(b)
    applyTax(c).price
  }
}