ThisBuild / scalaVersion := "3.3.0"
ThisBuild / organization := "com.gregorpurdy"
ThisBuild / organizationName := "Gregor Purdy"
ThisBuild / startYear := Some(2023)
ThisBuild / licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

addCommandAlias(
  "check",
  "; headerCheck; scalafmtSbtCheck; scalafmtCheckAll; scalafixAll --check"
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
