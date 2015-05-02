# CaseClassMapper
This Macro allows you to convert a map to a case class and vice versa

Usage Example:

# build.sbt

```scala
resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= {
  Seq(
    "com.kreattiewe" %% "case-class-mapper" % "1.0"  
    )
}

```

```scala

trait Mapper[T] {

  def mapToCase[T: Mappable](map: Map[String, Any]) = {
    implicitly[Mappable[T]].fromMap(map)
  }

  def caseToMap[T: Mappable](t: T) = {
    implicitly[Mappable[T]].toMap(t)
  }

}

case class User(name: String)

object UserMapper extends Mapper[User]

val user:User = UserMapper.mapToCase(Map("name"->"Michel"))

```
