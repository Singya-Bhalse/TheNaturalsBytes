FROM openjdk:8
EXPOSE 8080
WORKDIR /app

ADD target/spring-boot-docker.jar /app/spring-boot-docker.jar 
ENTRYPOINT ["java","-jar","/app/spring-boot-docker.jar"]