pipeline {
    agent any
    environment {
        BOOTSTRAP_HOME = '/var/lib/jenkins/workspace/bootstrap/bootstrap-linux'
        }

    stages {
        stage('Build') {
            steps {
                // JENKINSHOME is just a name to help readability
                //withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
                //echo "PATH is: $PATH"
                echo " $BOOTSTRAP_HOME "
            }
        }
        stage('Config') {
            steps {
                // JENKINSHOME is just a name to help readability
                //withEnv(['PATH+BOOTSTRAPHOME=/var/lib/jenkins/workspace/bootstrap/bootstrap-linux']) {
                //sh ( mvn-iib.sh )
                //echo "PATH is: $PATH"
                echo " $BOOTSTRAP_HOME "
             }
        }
    }
}
