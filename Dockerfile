FROM eclipse-temurin:21

RUN set -eux ;\
    useradd --shell /usr/bin/bash --no-create-home jrunner ;\
    mkdir /app

COPY target/api-scan-0.0.1-SNAPSHOT.jar /app/app.jar

RUN set -eux ;\
    chown -R jrunner:jrunner /app

USER jrunner

EXPOSE 8080
CMD ["java", "-Xms256m", "-Xmx256m", "-jar", "/app/app.jar"]