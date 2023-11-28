FROM amazoncorretto:17-alpine-jdk
MAINTAINER DSOBARZO
COPY target/notificacionmail-0.0.1-SNAPSHOT.jar notificacion-app.jar
ENTRYPOINT ["java","-jar","/notificacion-app.jar"]