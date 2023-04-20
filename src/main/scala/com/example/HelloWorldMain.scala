package com.example

import zio.ZIOAppDefault
import zio.Scope
import zio.ZIO
import zio.ZIOAppArgs
import zio.Console._

object HelloWorldMain extends ZIOAppDefault {

  override def run: ZIO[Any & (ZIOAppArgs & Scope), Any, Any] = for {
    _ <- printLine("Hello, world!")
  } yield ()

}
