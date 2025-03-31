pipeline {
    agent any

    stage('Say Hello') {
                steps {
                    echo '👋 Hello, Jenkins is working!'
                }
            }

    stages {
        stage('Run TestNG Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo '✅ 测试执行完毕！'
        }
    }
}