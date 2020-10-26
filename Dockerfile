FROM java:8-jdk-alpine
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/app/
COPY MysqlDB/docker-application.properties /usr/app/
WORKDIR /usr/app
EXPOSE 8080 3306 3307
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar","--spring.config.location=docker-application.properties"]