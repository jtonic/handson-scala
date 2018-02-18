package pis3.packages

import tasks._

/**
  * Created by Antonel Ernest Pazargic on 19/02/2018.
  *
  * @author Antonel Ernest Pazargic
  */
object TasksClient extends App {

  println(pq.granting.phaseOne)

  println(pq.revocation.phaseOne)

  println(psd2.granting.phaseOne)

  println(psd2.revocation.phaseOne)

  psd2.granting.executePhase(psd2.granting.phaseOne)
}
