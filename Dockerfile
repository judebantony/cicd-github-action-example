FROM openjdk:8-jdk-alpine
MAINTAINER Jude Antony <judebantony@gmail.com>

VOLUME /tmp
VOLUME /logs
WORKDIR /tmp
COPY target/cigithubaction.jar /tmp/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tmp/cigithubaction.jar"]
EXPOSE 18080