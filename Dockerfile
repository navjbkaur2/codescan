FROM openjdk:8
USER root
COPY target/Backend-1.0.0.jar Backend.jar
RUN chmod 755 Backend.jar
ENTRYPOINT exec java -jar Backend.jar 
