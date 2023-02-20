FROM amazoncorretto:11-alpine-jdk
MAINTAINER Grincode
COPY target/porfolio-0.0.1-SNAPSHOT.jar grincode-app.jar
ENTRYPOINT ["java,","-jar","/grincode-app.jar"]
