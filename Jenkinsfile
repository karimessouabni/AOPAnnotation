pipeline {
    agent any
    tools {
            maven 'apache-maven-3.3.9'
    }
    stages {
        stage('Build') {
            steps {
             sh 'mvn clean install'
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