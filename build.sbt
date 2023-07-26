ThisBuild / scalaVersion := "3.3.0"
ThisBuild / organization := "com.gregorpurdy"

addCommandAlias(
  "check",
  "; scalafmtSbtCheck; scalafmtCheckAll"
)

lazy val zioVersion = "2.0.15"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion % Compile,
      "dev.zio" %% "zio-test" % zioVersion % Test,
      "dev.zio" %% "zio-test-sbt" % zioVersion % Test,
      "dev.zio" %% "zio-test-magnolia" % zioVersion % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
