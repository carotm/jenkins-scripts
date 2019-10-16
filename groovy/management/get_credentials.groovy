def creds = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        com.cloudbees.plugins.credentials.impl.UsernamePasswordCredentialsImpl.class,
        Jenkins.instance, 
        null, 
        null );
for (c in creds) { 
	println(c.id + " | " + c.username + " | " + c.password) 
}

def creds1 = com.cloudbees.plugins.credentials.CredentialsProvider.lookupCredentials(
        org.jenkinsci.plugins.plaincredentials.impl.StringCredentialsImpl,
        Jenkins.instance, 
        null, 
        null );
for (c in creds1) { 
	println(c.id + '|' + c.secret) 