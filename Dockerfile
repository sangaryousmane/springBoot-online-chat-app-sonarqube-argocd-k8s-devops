FROM openjdk:17

ARG JAR_URL=target/*.jar

COPY ${JAR_URL} online-chat-application.jar

ENTRYPOINT ["java", "-jar", "/online-chat-application.jar"]

EXPOSE 9500