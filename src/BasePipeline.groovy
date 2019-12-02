package mj.jlib

abstract class BasePipeline{
  abstract def buildProject(langVersion);
  def buildDockerImage(def script){
    script.sh 'In Base buildDockerImage'
  }
}
