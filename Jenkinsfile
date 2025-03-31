pipeline {
    agent any

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