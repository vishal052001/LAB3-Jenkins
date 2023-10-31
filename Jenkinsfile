pipeline {
    agent any
    environment {
        PATH = "D:\\Software\\apache-maven-3.9.5\\bin$PATH"
        // Add other environment variables as needed
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                bat "C:\\WINDOWS\\system32\\cmd.exe /c mvn clean test"
            }
        }
    }
}
