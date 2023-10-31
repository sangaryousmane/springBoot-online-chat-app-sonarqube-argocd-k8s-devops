FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} chat-app.jar

ENTRYPOINT ["java", "-jar", "chat-app.jar"]

EXPOSE 9500
