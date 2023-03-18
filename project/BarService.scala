import com.github.ghik.sbt.nosbt.ProjectGroup
import sbt.Keys._
import sbt._

object BarService extends ProjectGroup("barservice", MyProj) {
  lazy val root: Project = mkRootProject
  
  lazy val api: Project = mkSubProject.dependsOn(Commons.api)
  lazy val impl: Project = mkSubProject.dependsOn(api, Commons.db, FooService.api)
}

