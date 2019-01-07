pipeline {
    agent any
    tools {
            maven 'maven'
            jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
            steps {
            // sh 'mvn clean install'
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