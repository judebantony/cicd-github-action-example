FROM openjdk:8-jdk-alpine
MAINTAINER Jude Antony <judebantony@gmail.com>

COPY target/cigithubaction.jar cigithubaction.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cigithubaction.jar"]
EXPOSE 18080