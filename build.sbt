//name := "VexRiscv"
//
//organization := "com.github.spinalhdl"
//
//version := "1.0.0"
//
//scalaVersion := "2.11.6"
//
//EclipseKeys.withSource := true
//
//libraryDependencies ++= Seq(
//  "com.github.spinalhdl" % "spinalhdl-core_2.11" % "1.2.1",
//  "com.github.spinalhdl" % "spinalhdl-lib_2.11" % "1.2.1",
//  "org.scalatest" % "scalatest_2.11" % "2.2.1",
//  "org.yaml" % "snakeyaml" % "1.8"
//)
//
//
//
//addCompilerPlugin("org.scala-lang.plugins" % "scala-continuations-plugin_2.11.6" % "1.0.2")
//scalacOptions += "-P:continuations:enable"
//fork := true

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.spinalhdl",
      scalaVersion := "2.11.6",
      version      := "1.0.0"
    )),
    libraryDependencies ++= Seq(
        "org.scalatest" % "scalatest_2.11" % "2.2.1",
        "org.yaml" % "snakeyaml" % "1.8"
    ),
    name := "VexRiscv"
  ).dependsOn(spinalHdlSim,spinalHdlCore,spinalHdlLib)
lazy val spinalHdlSim = ProjectRef(file("../spinal"), "SpinalHDL-sim")
lazy val spinalHdlCore = ProjectRef(file("../spinal"), "SpinalHDL-core")
lazy val spinalHdlLib = ProjectRef(file("../spinal"), "SpinalHDL-lib")

addCompilerPlugin("org.scala-lang.plugins" % "scala-continuations-plugin_2.11.6" % "1.0.2")
scalacOptions += "-P:continuations:enable"
fork := true
