import pis3.ch3.Test

import scala.io.Source

val is = Test.getClass.getResourceAsStream("file.txt")
for(line <- Source.fromInputStream(is).getLines) {
  println(line.length + " " + line)
}