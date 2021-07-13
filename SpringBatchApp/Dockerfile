FROM adoptopenjdk/openjdk8
EXPOSE 8080
ADD target/SpringCSVBatchApp.jar /opt/app/SpringCSVBatchApp.jar
ENTRYPOINT ["java", "-jar", "/opt/app/SpringCSVBatchApp.jar"]