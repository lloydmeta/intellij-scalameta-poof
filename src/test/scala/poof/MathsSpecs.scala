package poof

import cats._
import cats.implicits._
import org.scalatest.{FunSpec, Matchers}

class MathsSpecs extends FunSpec with Matchers {

  import Maths.ops._
  def wtfAdd[F[_]: Monad: Maths](x: Int, y: Int): F[Int] =
    for {
      s1 <- Maths.add(x, y)
      s2 <- Maths.add(x, s1)
      s3 <- Maths.add(s1, s2)
    } yield s3

  it("should math") {
    wtfAdd[Option](1, 2) shouldBe Some(7)
  }

}
