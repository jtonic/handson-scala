def g() = try 1 finally 2
def g2(): Int = try return 1 finally return 2

g

g2


import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) =
try {
  new URL(path)
} catch {
  case e: MalformedURLException =>
    new URL("http://www.scala-lang.org")
} finally {
  new URL("http://www.google.com")
}

urlFor("jtonic")
urlFor("http://yahoo.com")


