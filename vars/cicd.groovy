def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def BuildArtifact()
{
   sh 'mvn package'
}  
