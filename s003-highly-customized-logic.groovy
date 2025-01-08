node {
    def useDocker = true

    stage('Build') {
        if (useDocker) {
            echo 'Using Docker for build...'
            // sh 'docker build -t my-app .'
        } else {
            echo 'Using local environment for build...'
            // sh './gradlew build'
        }
    }
}
