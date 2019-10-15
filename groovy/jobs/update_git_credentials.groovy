//filter by git url
import hudson.plugins.git.*
jenkins.model.Jenkins.instance.getAllItems(hudson.model.FreeStyleProject.class).each{ job ->
  job.getScm().findAll{it.class == GitSCM.class && it.userRemoteConfigs.url.toString().contains('git@')
                      }.each{ 
    
    def oldScm = job.scm
    def newUserRemoteConfigs = oldScm.userRemoteConfigs.collect {
      new UserRemoteConfig(it.url, it.name, it.refspec, 'a6fe77dc-3db5-4cd8-9fac-5b027392612f')
    }
    def newScm = new GitSCM(newUserRemoteConfigs, oldScm.branches, oldScm.doGenerateSubmoduleConfigurations,
                            oldScm.submoduleCfg, oldScm.browser, oldScm.gitTool, oldScm.extensions)
    
    job.scm = newScm 
      println(job.getDisplayName() + ' ' +job.getScm().userRemoteConfigs.url.toString() + ' ' + job.getScm().userRemoteConfigs.credentialsId) 
      
  }
}
