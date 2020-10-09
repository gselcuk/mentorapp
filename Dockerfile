FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar goktugselcukmentor.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/goktugselcukmentor.jar"]