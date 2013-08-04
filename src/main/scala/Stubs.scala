/**
 * Created by jtonic on 8/4/13.
 */
object Stubs {
  def findTheBasePrice(productId: String): Double =  10.0
  def findStateSpecificDiscount(producId: String, stateCode: String): Double = 0.5
  def findProductSpecificDiscount(productId: String, stateCode: String): Double = 0.5
  def calculateTax(productId: String, price: Double): Double = 5.0
}
