FROM openjdk:11 
ADD target/springboot-mongo.jar springapp.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","springapp.jar"] 
