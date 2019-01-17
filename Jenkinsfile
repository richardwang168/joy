pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // JENKINSHOME is just a name to help readability
                withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {

                echo "PATH is: $PATH"
                
                sh " mvn-iib.sh "
                }
            }
        }
        stage('Test') {
            steps {
                // JENKINSHOME is just a name to help readability
                //withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
                sh ( mvn-iib.sh )
             }
        }
    }
}
