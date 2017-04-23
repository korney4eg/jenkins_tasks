// Define list of repositories to check out
def my_repos = ['a','b','c','d']

stage('Preparation'){
    for (repo in my_repos){
      echo 'Checking out repo ${repo}'
    }
}
