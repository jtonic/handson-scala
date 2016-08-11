package akka

import akka.actor.Props
import akka.actor.Actor
import akka.event.LoggingReceive

/**
  * Created by antonelpazargic on 11/08/16.
  */
class BookingMain extends Actor {

  val flight = context.actorOf(Props[Flight], "Stockholm-Nassau")
  val hotel  = context.actorOf(Props[Hotel], "Atlantis")
  val travelAgent = context.actorOf(Props[TravelAgent], "ClubMed")
  travelAgent ! TravelAgent.BookTrip(flight, hotel, 20)

  def receive = LoggingReceive {
    case TravelAgent.Done =>
      println("Booking Successfully")
      context.stop(self)
    case TravelAgent.Failed =>
      println("Booking Failed")
      context.stop(self)
  }

}
