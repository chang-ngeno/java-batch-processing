FROM adoptopenjdk/openjdk8
EXPOSE 8080
ADD target/*.jar /opt/app/*.jar
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar"]