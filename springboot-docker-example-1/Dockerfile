# Base Image
FROM gradle:7.2.0-jdk16
MAINTAINER cmabdullah21@gmail.com
# Copy the project to /app
RUN ls -la
COPY --chown=gradle:gradle . /app
# [Setting up working directory] tells docker to use app directory as a working directory.
# All commands now will run from this directory.
WORKDIR /app
# build this project
RUN gradle clean build
# expose to port 8080
EXPOSE 8080
# copy the jar file to the app directory
# COPY build/libs/*.jar app-1.jar
COPY build/libs/springboot-docker-example-1-0.0.1-SNAPSHOT.jar app-2.jar
RUN ls -la
# command tells docker the arrays of commands will run when a container gets starter from this image.
ENTRYPOINT ["java", "-jar","app-1.jar"]
# docker build -t cmabdullah21/spring-boot-docker-v01 --progress=plain .
# docker run -p 8082:8080 -d --name app-1 cmabdullah21/spring-boot-docker-v01

