name := "ScalaLearning"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= {
  val akkaVersion = "2.5.22"
  
 Seq(
   "com.typesafe.akka" %% "akka-http"   % "10.1.8",
   "com.typesafe.akka" %% "akka-stream" % akkaVersion,
   "com.typesafe.akka" %% "akka-actor" % akkaVersion,
   "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
   "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.8",
   "com.typesafe.akka" %% "akka-http-caching" % "10.1.8",
   "com.typesafe.akka" %% "akka-http"   % "10.1.8",
   "com.typesafe.akka" %% "akka-stream" % akkaVersion
 )
}