node('master') {
    stage('get clone'){
        //check CODE
       git credentialsId: '2dbaf026-913f-4ca2-a470-79768fdd8f8c', url: 'git@ofordcode.ofo.so:qa/testAllure2.git'
    }
    stage('comment'){
        //check CODE
       echo 'xx'
    }
    stage('mvn test'){

        try {
            
                 withMaven(
                     maven: 'mvn2') {

                        sh "mvn test"
                    }
        }
        catch (exc) {
            echo 'Something failed, I should sound the klaxons!'
        }
       
    }

    
    stage('allure report'){
        //check CODE
        allure includeProperties: false, jdk: '', results: [[path: 'allure-results'], [path: 'target/allure-results']]

    }

}
