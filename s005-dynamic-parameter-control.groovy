node {
    def buildType = params.BUILD_TYPE ?: 'debug'

    stage('Build') {
        echo "Building in ${buildType} mode..."
        // sh "./build.sh --mode=${buildType}"
    }
}
