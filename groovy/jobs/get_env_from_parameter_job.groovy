import hudson.model.ParametersAction

def result = [:]
def upstream = currentBuild.getAction(ParametersAction).getParameters().find { 
    it.name == 'upstreamJob' 
}
['VAR1', 'VAR2'].each {
  result[it] = upstreamJob.getRun().getEnvVars().get(it) 
}  