env.agentName = ""

branch_name = "10.1.0"
pipeline {
    agent none

    stages {
        stage('Prep') {
            steps {
                script {
                    println branch_name
                    if ("${branch_name}" == "9.2.0") {
                        env.agentName = "9.2agent"
                    } else {
                        env.agentName = "10.1agent"
                    }
                }
            }
        }

        stage('Finish') {
            steps {
                node (agentName as String) { println env.agentName }
                script {
                    println agentName
                }
            }
        }

    }
}
