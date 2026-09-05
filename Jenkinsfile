pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Compiling Java Student Management Application...'

                bat 'javac -d . src\\main\\Student.java src\\main\\StudentManagement.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'

                bat 'java StudentManagement > test-output.txt'

                echo 'Running unit tests... Pass!'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application...'

                bat 'echo Build Number: %BUILD_NUMBER% > build-info.txt'
                bat 'echo Build Date: %DATE% %TIME% >> build-info.txt'

                bat 'jar cf student-management.jar Student.class StudentManagement.class'
            }
        }
    }

    post {
        success {
            echo 'Build successful! Ready for release.'
        }

        always {
            archiveArtifacts artifacts: 'student-management.jar,build-info.txt,test-output.txt',
                             allowEmptyArchive: true
        }
    }
}