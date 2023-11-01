FROM adoptopenjdk/maven-openjdk11:latest AS builder

WORKDIR /opt/app

COPY . .

RUN mvn clean package

# You can change this base image to anything else
# But make sure to use the correct version of Java

FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /opt/app

COPY --from=builder /opt/app/target/chat-app.jar /opt/app/chat-app.jar

USER nobody

# This should not be changed
ENTRYPOINT ["java", "-jar", "chat-app.jar"]
