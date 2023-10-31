FROM openjdk:17


WORKDIR /opt/chat-app

ARG JAR_FILE=target/chat-app.jar

COPY ${JAR_FILE} chat-app.jar

ENTRYPOINT ["java", "-jar", "chat-app.jar"]
