pipeline{
    agent any
    tools{
        maven "Maven"
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
