pipeline{
    agent any
    tools{
        maven "Maven"
    }
    environment{
        dockerImage = ''
        registry = 'asr2000/BookStoreApp'
    }
    stages{
        stage("dev"){
            steps{
                sh "mvn -B -DskipTests clean package"
                echo "installed" 
                sh "sudo apt-get install docker-engine -y"
//                 script{
//                     dockerImage = docker.build registry
//                 }
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
