FROM openjdk:21
VOLUME /tmp
ADD target/BookApi.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]