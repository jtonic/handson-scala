/**
 * Created by jtonic on 8/4/13.
 */

trait Functor[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
}

object ListFunctor extends Functor[List] {
  def map[A, B](la: List[A])(f: A => B): List[B] = la map f

  def unzip[A, B](fab: List[(A, B)]): (List[A], List[B]) = {
    (fab.map(_._1), fab.map(_._2))
  }
}

object Functors extends App {
  val list1 = List(1, 2, 3, 4)
  val list2 = List((1, 11), (2, 12), (3, 13), (4, 14))
  println("list1 = " + list1)
  val mapped: List[Int] = ListFunctor.map(list1)(_ + 2)
  println("mapped = " + mapped)
  val unzipped = ListFunctor.unzip(list2)
  println("unzipped = " + unzipped)
}

