pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
            steps {
            sh '''
                 echo "PATH = ${PATH}"
                 echo "M2_HOME = ${M2_HOME}"
             '''
            }
        }
       stage ('Build') {
                  steps {
                      sh 'mvn -Dmaven.test.failure.ignore=true install'
                  }
                  post {
                      success {
                          junit 'target/surefire-reports/**/*.xml'
                      }
                  }
       }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}