/**
 * Created by jtonic on 8/4/13.
 */

object PriceCalculatorWithMonads {

  trait State[S, +A] {
    def apply(s: S): (S, A)
  }

  object State {
    def state[S, A] (f: S => (S, A)) = new State[S, A] {
      def apply(s: S) = f(s)
    }

    def init[S]: State[S, S] = state[S, S] (s => (s, s))

    def modify[S] (f: S => S) = {
//      init[S].flatMap(s => state(_ => (f(s), ())))
    }
  }

}