pipeline{
    agent any
    tools{
        maven "Maven"
    }
    stages{
        stage("dev"){
            steps{
                sh "mvn -B -DskipTests clean package"
                echo "installed" 
            }
        }
        stage("test"){
            steps{
               echo "test" 
            }
        }
        stage("prod"){
            steps{
                echo "prod"
            }
        }
    }
}
