pipeline{
    agent any
    tools{
        maven "maven"
    }
    stages{
        stage("dev"){
            steps{
                sh 'mvn -B -DskipTests clean package'
                echo ' installed ' 
            }
        }
        stage("test"){
            steps{
                
            }
        }
        stage("prod"){
            steps{
                
            }
        }
    }
}
