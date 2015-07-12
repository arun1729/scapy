name := "scapy"

organization := "org.scapy"

version := "0.1"

scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
	"typesafe"				at		"http://repo.typesafe.com/typesafe/releases",
	"Akka Repository" 		at 		"http://repo.akka.io/releases/",
	"Maven Central"			at		"http://repo1.maven.org/maven2/",
	"cloudera repo"			at		"https://repository.cloudera.com/artifactory/cloudera-repos/"
)

libraryDependencies ++= Seq(
	"org.scala-lang" % "scala-actors" % "2.10.0-M6",
    	"org.slf4j"						%	"slf4j-api"					%	"1.7.5",
    	"org.slf4j"						%	"slf4j-simple"				%	"1.7.5",
	"joda-time"						%	"joda-time"					%	"2.3",
	"org.joda"						%	"joda-convert"				%	"1.6",
	"org.scalatest"					%%  "scalatest"					%   "2.1.7",
	"org.scalacheck"				%%  "scalacheck"				%	"1.11.4",
	"com.typesafe"                  %   "config"            		%   "1.0.0",
	"com.typesafe.akka" 			% 	"akka-actor_2.10" 			% 	"2.3.11",
	 "org.apache.thrift" % "libthrift" % "0.9.2"
)




