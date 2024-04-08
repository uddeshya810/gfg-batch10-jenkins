pipeline {
	agent any
	tools {
	maven 'MAVEN_HOME'
	}
	
	stages{
			stage('Welcome Stage')
			{
			 steps
			 {
			 	echo 'welcome to Jenkins Pipeline'
			 }
			}
			
			stage('Maven Clean')
			{
			 steps
			 {
			      'mvn clean' 
			 }
			}
			stage('Maven package')
			{
			 steps
			 {
			 	bat 'mvn package' 
			 }
			}
			stage('Maven Install')
			{
			 steps
			 {
			 	bat 'mvn install' 
			 }
			}
			stage('Maven Test')
			{
			 steps
			 {
			 	bat 'mvn test' 
			 }
			}
			stage('Final Build Step')
			{
			 steps
			 {
			 	echo 'Build Done' 
			 }
			}
		}
	}
	
