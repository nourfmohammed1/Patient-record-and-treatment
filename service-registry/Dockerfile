FROM eclipse-temurin:25.0.1_8-jre-alpine-3.23
RUN apk add --no-cache curl
VOLUME /tmp

EXPOSE 8761

ARG JAR_FILE=build/libs/*.jar 

COPY ${JAR_FILE} discovery-server.jar

ENTRYPOINT ["java", "-jar", "/discovery-server.jar"]