node {
    try {
        // 设置工作区间
        stage('Checkout') {
            echo 'Code checked out from SCM'
        }

        // 编译阶段
        stage('Build') {
            echo 'Building the application...'
            // sh './gradlew build'
        }

        // 测试阶段
        stage('Test') {
            echo 'Running tests...'
            // sh './gradlew test'
        }

        // 部署阶段
        stage('Deploy') {
            echo 'Deploying to the server...'
            // sh './deploy.sh'
        }
    } catch (Exception e) {
        echo "Error occurred: ${e.getMessage()}"
    } finally {
        echo 'Pipeline completed!'
    }
}
