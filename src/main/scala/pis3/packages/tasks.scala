/**
  * Created by Antonel Ernest Pazargic on 19/02/2018.
  *
  * @author Antonel Ernest Pazargic
  */
package tasks {

  package object pq {
    object granting {
      val phaseOne: String = "granting_pq"

      def executePhase(name: String) = {
        println(s"execute $phaseOne")
      }
    }
    object revocation {
      val phaseOne = "revocation_pq"

      def executePhase(name: String) {
        println(s"execute $phaseOne")
      }
    }
  }
}

package tasks.psd2 {

  package object granting {
    val phaseOne: String = "granting_psd2"

    def executePhase(name: String) {
      println(s"execute $phaseOne")
    }
  }

  package object revocation {
    val phaseOne = "revocation_psd2"

    def executePhase(name: String) {
      println(s"execute $phaseOne")
    }
  }
}


