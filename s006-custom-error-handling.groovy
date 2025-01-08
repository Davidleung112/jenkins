node {
    try {
        stage('Build') {
            echo 'Building...'
            // sh './build.sh'
        }
    } catch (Exception e) {
        echo "Build failed: ${e.getMessage()}"
        // sh './cleanup.sh'
    } finally {
        // echo 'Pipeline finished!'
    }
}
