FROM openjdk:8
Add target/docker-spring.jar app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","app.jar"]