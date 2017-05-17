package poof

import diesel.diesel

@diesel
trait Maths[F[_]] {
  def add(x: Int, y: Int): F[Int]
}

object Maths {

  implicit val interp = new Maths[Option] {
    def add(x: Int, y: Int): Option[Int] = Some(x + y)
  }
}