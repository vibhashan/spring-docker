FROM eclipse-temurin:21
LABEL maintainer="vibhashana"
WORKDIR /spring-docker
COPY target/spring-docker-0.0.1-SNAPSHOT.jar spring-docker
EXPOSE 5000
ENTRYPOINT ["java","-jar","spring-docker"]