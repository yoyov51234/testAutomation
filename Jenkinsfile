pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yoyov51234/testAutomation.git' // TODO: 改成你的仓库地址
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