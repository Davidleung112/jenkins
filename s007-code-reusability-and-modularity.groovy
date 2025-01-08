def buildApp(String mode) {
    echo "Building app in ${mode} mode..."
    // sh "./build.sh --mode=${mode}"
}

node {
    stage('Debug Build') {
        buildApp('debug')
    }
    stage('Release Build') {
        buildApp('release')
    }
}
