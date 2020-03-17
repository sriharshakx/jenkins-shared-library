def deploy() {
    echo "Start Deploy"
    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}