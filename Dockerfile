FROM eclipse-temurin:19-alpine

WORKDIR /app

COPY target/*.jar .