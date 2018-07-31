FROM openjdk:8-jdk-alpine
 
ADD build/libs/*.jar app.jar

EXPOSE 8280

CMD ["java", "-jar", "app.jar"]


 