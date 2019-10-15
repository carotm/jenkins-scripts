def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl.class,
        Jenkins.instance, 
        null, 
        null );
for (c in creds) { 
	println(c.id + " | " + c.username + " | " + c.password) 
}
