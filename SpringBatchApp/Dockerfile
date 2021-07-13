FROM adoptopenjdk/openjdk8
EXPOSE 8081
ADD target/*.jar /opt/app.jar
ADD src/main/resources/data/users.csv src/main/resources/data/users.csv
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]