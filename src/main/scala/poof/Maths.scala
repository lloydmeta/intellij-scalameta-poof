package poof

import diesel.diesel

@diesel
trait Maths[F[_]] {
  def add(x: Int, y: Int): F[Int]
}