pipeline {
 agent any
 stages {
 stage('Build') {
 steps {
 echo 'Compiling application...'
    bat 'javac src\\main\\Student.java'
 }
 }
 stage('Test') {
 steps {
 echo 'Running unit tests...'
 bat 'java -cp src\\main Student'
 }
 }
 stage('Package') {
 steps {
    echo 'Packaging application...'
    bat 'jar cf Student.jar -C src\\main Student.class'
 }
 }
 }

 post {
 success {
 echo 'Build successful! Ready for release.'
 }
 }
}