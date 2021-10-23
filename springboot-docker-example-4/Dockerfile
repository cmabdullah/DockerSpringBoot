FROM adoptopenjdk/openjdk11:latest
VOLUME /main-app
ADD build/libs/springboot-docker-example-3-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]