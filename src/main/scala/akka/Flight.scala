package akka

/**
  * Created by antonelpazargic on 11/08/16.
  */

import akka.actor.Actor
import akka.event.LoggingReceive

object Flight {
  case class BookSeat(number: Int) {
    require(number > 0)
  }

  case object Done
  case object Failed
}

class Flight extends Actor {
  import Flight.BookSeat
  import Flight.Done
  import Flight.Failed

  var seatsLeft = 50

  def receive = LoggingReceive {
    case BookSeat(nb) if nb <= seatsLeft =>
      seatsLeft -= nb
      sender ! Done
    case _ => sender ! Failed
  }

}
