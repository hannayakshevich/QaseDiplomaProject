pipeline {
    agent any

    tools {
        // Install the Maven version configured as "3.8.6" and add it to the path.
        maven "3.8.6"
    }

    stages {
        stage('Testing') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/hannayakshevich/QaseDiplomaProject.git'

                // Run Maven on a Unix agent.
                // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                bat "mvn -Dbrowser=chrome -Dsurefire.suiteXmlFiles=src/test/resources/testng-smoke.xml clean test"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'

                }
            }
        }
        stage('reports') {
         steps {
             script {
                     allure([
                             includeProperties: false,
                             jdk: '',
                             properties: [],
                             reportBuildPolicy: 'ALWAYS',
                             results: [[path: 'target/allure-results']]
                     ])
             }
         }
        }

    }

}
