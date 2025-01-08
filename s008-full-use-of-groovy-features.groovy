node {
    def stagesList = ['Build', 'Test', 'Deploy']
    
    stagesList.each { stageName ->
        stage(stageName) {
            echo "Executing stage: ${stageName}"
        }
    }
}
