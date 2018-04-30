#!/bin/sh
mvn clean package && docker build -t com.airhacks/docks .
docker rm -f docks || true && docker run -d -p 8080:8080 -p 4848:4848 --name docks com.airhacks/docks 
