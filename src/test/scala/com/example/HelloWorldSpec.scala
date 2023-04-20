package com.example

import zio._
import zio.test.Assertion._
import zio.test._

object HelloWorldSpec extends ZIOSpecDefault {

  def spec: Spec[Any, Any] = suite("HelloWorldSpec")(
    test("Something trivial") {
      for {
        result <- ZIO.succeed("Hello")
      } yield assert(result)(equalTo("Hello"))
    }
  )

}
