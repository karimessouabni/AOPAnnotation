pipeline {
    agent any
    tools {
            maven 'maven'
            jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
           withMaven() {
             bat "mvn clean install"
           }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}