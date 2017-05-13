enablePlugins(ScalaJSPlugin)

name := "Real Estate Modeling"
scalaVersion := "2.12.2"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1",
  "com.lihaoyi" %%% "utest" % "0.4.4" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

jsDependencies ++= Seq(
  RuntimeDOM,
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
)
