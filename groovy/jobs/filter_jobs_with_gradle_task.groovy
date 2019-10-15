def builderFilter = {  builder -> builder.class == hudson.plugins.gradle.Gradle.class }

jenkins.model.Jenkins.instance.getAllItems(hudson.model.FreeStyleProject.class).each{ job ->
  job.getBuilders().findAll(builderFilter).each{ gradleStep -> 
    gradleStep.each { gradleItem -> 
      println(job.getDisplayName() + ' ' + gradleItem.getTasks())
    } 
  }
}