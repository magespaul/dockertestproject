FROM openjdk:18

WORKDIR /app

COPY .target/*.jar ./application.jar

EXPOSE 8080

ENTRYPOINT java -jar application.jar