/**
 * ***********************************************************************
 * <p/>
 * <b>Authors:</b>
 * Antonel Pazargic (antonel.pazargic@1and1.ro) aka jtonic
 * <p/><b>Date:</b> 7/14/13
 * <p/><b>Time:</b> 9:15 PM
 * <p/>
 * ***********************************************************************
 */

object Logic {

  def matchLiklihood(kitter: Kitten, buyer: BuyerPreferences): Double = {
    val matches = buyer.attributes.map(attribute => kitter.attributes.contains(attribute))
    val nums = matches.map(matched => if (matched) 1.0 else 0.0)
    nums.sum / nums.length
  }

}
