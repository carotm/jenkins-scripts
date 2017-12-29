env = currentBuild.getEnvironment()
currentBuild.setDisplayName("${env['BUILD_DISPLAY_NAME']} ${env['BUILD_CAUSE']}")
