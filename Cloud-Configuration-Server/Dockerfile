FROM eclipse-temurin:25.0.1_8-jre-alpine-3.23
RUN apk add --no-cache curl
VOLUME /tmp

# Config Server عادة يعمل على منفذ 8888
EXPOSE 8888

ARG JAR_FILE=build/libs/*.jar

# تغيير الاسم ليكون واضحاً في الدوكر
COPY ${JAR_FILE} config-server.jar

ENTRYPOINT ["java", "-jar", "/config-server.jar"]