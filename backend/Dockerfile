#!/bin/bash
FROM openjdk:17-alpine

 

# Passing working_dir: backend in docker-compose passes the relative path to the Dockerfile in context 
WORKDIR ./backend
COPY . .  
# Use the bash shell 
RUN /bin/sh

EXPOSE 8000
ENTRYPOINT "./entrypoint.sh"
