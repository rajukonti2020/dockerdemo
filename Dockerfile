FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/Docker-Demo.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]