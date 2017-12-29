item = Jenkins.instance.getItemByFullName("jobName")
item.updateNextBuildNumber(1)

//THIS WILL REMOVE ALL BUILD HISTORY
item.builds.each() { build ->
  build.delete()
}
item.updateNextBuildNumber(1)