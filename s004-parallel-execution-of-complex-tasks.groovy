node {
    stage('Parallel Testing') {
        parallel(
            'Unit Tests': {
                echo 'Running Unit Tests...'
                // sh './gradlew test'
            },
            'Integration Tests': {
                echo 'Running Integration Tests...'
                // sh './gradlew integrationTest'
            },
            'Linting': {
                echo 'Running Code Linting...'
                // sh './lint.sh'
            }
        )
    }
}
