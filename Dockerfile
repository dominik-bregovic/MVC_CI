FROM openjdk:8-jdk-alpine

ENV APP_HOME=/usr/app

RUN mkdir -p $APP_HOME

COPY target/*.jar $APP_HOME/app.jar

WORKDIR $APP_HOME

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]