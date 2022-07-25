FROM adoptopenjdk/maven-openjdk11
EXPOSE 8081
ARG JAR_FILE="target/first-component-0.0.1-SNAPSHOT.jar"
ADD ${JAR_FILE} first-component.jar
ENTRYPOINT [ "java", "-jar", "/first-component.jar" ]
