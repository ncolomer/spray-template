organization  := "com.example"

version       := "0.1"

scalaVersion  := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.5"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %   "spray-servlet" % sprayV,
    "io.spray"            %   "spray-routing" % sprayV,
    "org.eclipse.jetty"   %   "jetty-webapp"  % "9.1.0.v20131115" % "container",
    "org.eclipse.jetty"   %   "jetty-plus"    % "9.1.0.v20131115" % "container",
    "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container"  artifacts Artifact("javax.servlet", "jar", "jar"),
    "io.spray"            %   "spray-testkit" % sprayV % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.7" % "test"
  )
}

seq(webSettings: _*)
