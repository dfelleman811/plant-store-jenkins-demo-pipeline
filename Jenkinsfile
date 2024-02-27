pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage("Test") {
            steps {
                sh 'mvn test'
            }
        }
        stage("Deploy") {
            steps {
                sh "java -jar ./target/plant-store-jenkins-demo-1.jar"
            }
        }
    }
    post {
        always {
            echo "Done"
        }
    }
}