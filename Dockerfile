FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/my-backend-app.jar app.jar  # Change le nom du fichier JAR selon ton projet

EXPOSE 8889

CMD ["java", "-jar", "app.jar"]
