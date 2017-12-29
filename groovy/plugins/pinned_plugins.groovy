jenkins.model.Jenkins.instance.getPluginManager().getPlugins()
    .findAll { plugin -> plugin.isPinned() }
    .each {
        println "${it.getShortName()} (${it.getVersion()})}"
}