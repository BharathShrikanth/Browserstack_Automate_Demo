pipeline {
    agent any
    stages {

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit allowEmptyResults: true, testDataPublishers: [[$class: 'AutomateTestDataPublisher']], testResults: 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}