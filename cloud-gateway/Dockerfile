
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

CMD ["/bin/sh"]
FROM eclipse-temurin:25.0.1_8-jre-alpine-3.23
RUN apk add --no-cache curl
VOLUME /tmp

EXPOSE 1919

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} gateway-service.jar

ENTRYPOINT ["java", "-jar", "/gateway-service.jar"]