def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def BuildArtifact()
{
   sh 'mvn package'
}  

def Deployment(jobname,ip,app)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${app}.war"
}  
