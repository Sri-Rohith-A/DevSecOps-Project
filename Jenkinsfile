pipeline{
    triggers {
        pollSCM('*/1 * * * *')
    }
    agent any
    tools{
        maven "Maven"
    }
    environment{
        dockerImage = ''
        registry = 'asr2000/test'
        registryCredential = 'Docker'
    }
    stages{
        stage("dev"){
            steps{
                sh "mvn -B -DskipTests clean package"
                echo "installed" 
                script{
                    dockerImage = docker.build registry
                    docker.withRegistry('', registryCredential){
                        dockerImage.push()
                    }
                }
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
