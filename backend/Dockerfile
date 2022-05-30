#!/bin/bash
FROM openjdk:17-alpine

 

# Passing working_dir: backend in docker-compose passes the relative path to the Dockerfile in context 
WORKDIR ./backend
COPY . . 
copy pom.xml pom.xml 
# Use the bash shell 
RUN /bin/sh

EXPOSE 8000

CMD ["./mvnw", "spring-boot:run"]
