package pis3.ch3

/**
  * Created by Antonel Ernest Pazargic on 16/05/2017.
  *
  * @author Antonel Ernest Pazargic
  */
object Test extends App {

  import scala.io.Source

  for(line <- Source.fromFile("/Users/antonelpazargic/jtonic/git/github/handson-scala/src/main/scala/pis3/ch3/Test.scala").getLines) {
    println(line.length + " " + line)
  }

}
