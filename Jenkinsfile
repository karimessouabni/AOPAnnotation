pipeline {
    agent any
    tools {
            maven 'maven'
            jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
            steps {
             sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
               sh 'ls'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}