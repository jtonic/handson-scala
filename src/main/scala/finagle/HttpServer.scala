package finagle

import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http
import com.twitter.util.{Await, Future}

/**
  * Created by Antonel Ernest Pazargic on 18/05/2017.
  *
  * @author Antonel Ernest Pazargic
  */
object HttpServer extends App {

  val service = new Service[http.Request, http.Response] {
    def apply(req: http.Request): Future[http.Response] =
      Future.value(
        http.Response(req.version, http.Status.Ok)
      )
  }

  val server = Http.serve(":8080", service)
  println("The http server is starting...")
  Await.ready(server)
  println("The http server started.")

}
