pipeline {
    agent any
    stages {
        stage('Build') {
        // JENKINSHOME is just a name to help readability
        withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
            steps {
                echo "PATH is: $PATH"
                
                sh " mvn-iib.sh "
                }
            }
        }
        // JENKINSHOME is just a name to help readability
        withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
        stage('Test') {
            steps {
                sh ( mvn-iib.sh )
             }
        }
    }
}
