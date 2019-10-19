FROM java:8-jdk-alpine

EXPOSE 9000

ARG JAR_FILE
ADD target/${JAR_FILE} /app/springboot-examples.jar
ENTRYPOINT ["java", "-jar", "/app/springboot-examples.jar"]