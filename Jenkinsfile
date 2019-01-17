pipeline {
    agent any
    // JENKINSHOME is just a name to help readability
    withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
    stages {
        stage('Build') {
            steps {
                echo "PATH is: $PATH"
                
                sh " mvn-iib.sh "
                }
            }
        }
        stage('Test') {
            steps {
                sh ( mvn-iib.sh )
             }
        }
    }
}
