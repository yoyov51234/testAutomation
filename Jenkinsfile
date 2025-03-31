pipeline {
    agent any



    stages {
        stage('Say Hello') {
                    steps {
                        echo '👋 Hello, Jenkins is working!'
                    }
                }
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