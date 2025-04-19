FROM openjdk:17

USER root
ADD  target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "demo.jar"]