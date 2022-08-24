FROM openjdk:11 
ADD target/springboot-mongo.jar springapp.jar 
ENTRYPOINT ["java","-jar","springapp.jar"] 