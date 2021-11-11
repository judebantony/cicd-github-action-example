FROM openjdk:17-ea-22-jdk-oracle
LABEL maintainer="Jude Antony <judebantony@gmail.com>"
COPY target/cigithubaction.jar cigithubaction.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cigithubaction.jar"]
EXPOSE 18080