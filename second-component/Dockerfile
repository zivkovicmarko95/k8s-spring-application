FROM adoptopenjdk/maven-openjdk11
EXPOSE 8081
ARG JAR_FILE="target/second-component-0.0.1-SNAPSHOT.jar"
ADD ${JAR_FILE} second-component.jar
ENTRYPOINT [ "java", "-jar", "/second-component.jar" ]
