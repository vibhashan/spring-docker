FROM eclipse-temurin:21.0.5_11-jdk-ubi9-minimal
WORKDIR /spring-docker
COPY target/spring-docker-0.0.1-SNAPSHOT.jar spring-docker.jar
EXPOSE 5000
ENTRYPOINT [ "java", "-jar", "spring-docker.jar" ]