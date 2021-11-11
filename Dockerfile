FROM openjdk:14-jdk-alpine3.10
LABEL maintainer="Jude Antony <judebantony@gmail.com>"
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY target/cigithubaction.jar cigithubaction.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cigithubaction.jar"]
EXPOSE 18080