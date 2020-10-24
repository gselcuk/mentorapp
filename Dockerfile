FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar mentorapp-user.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/mentorapp-user.jar"]