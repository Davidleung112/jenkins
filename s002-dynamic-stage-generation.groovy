node {
    def branches = ['feature1', 'feature2', 'hotfix']

    stage('Dynamic Stages') {
        for (branch in branches) {
            stage("Build for ${branch}") {
                echo "Building branch ${branch}..."
                // sh "git checkout ${branch}"
                // sh "./build.sh"
            }
        }
    }
}
