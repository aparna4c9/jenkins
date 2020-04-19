def a = '20'
node() {
    stage('one') {
        echo 'one'
        print a
    }
    stage('two') {
        echo 'two'
    }
}
