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
			    sh 'mvn clean' 
			 }
			}
			stage('Maven package')
			{
			 steps
			 {
			 	sh 'mvn package' 
			 }
			}
			stage('Maven Install')
			{
			 steps
			 {
			 	sh 'mvn install' 
			 }
			}
			stage('Maven Test')
			{
			 steps
			 {
			 	sh 'mvn test' 
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
	
