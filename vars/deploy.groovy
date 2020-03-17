def call(body) {
    echo "Start Deploy"
    def proc = "ls".execute()
    print 
    echo "Deployed"
    currentBuild.result = 'SUCCESS' //FAILURE to fail
    return this
}
