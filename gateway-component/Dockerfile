FROM adoptopenjdk/maven-openjdk11
EXPOSE 8080
ARG JAR_FILE="target/gateway-component-0.0.1-SNAPSHOT.jar"
ADD ${JAR_FILE} gateway-component.jar
ENTRYPOINT [ "java", "-jar", "/gateway-component.jar" ]
