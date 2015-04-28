name := "MyProject"

version := "1.0"

unmanagedBase := baseDirectory.value / "lib"

libraryDependencies ++= Seq(
  	"org.slf4j" % "slf4j-log4j12" % "1.7.12",
   	"org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  	"log4j" % "log4j" % "1.2.16",
  	"org.apache.zookeeper" % "zookeeper" % "3.3.6"
)

exportJars := true

packageOptions in (Compile, packageBin) +=
    Package.ManifestAttributes( java.util.jar.Attributes.Name.SEALED -> "true" )

