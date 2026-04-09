pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/KHALED12345670/JAVA-PROJECT.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
