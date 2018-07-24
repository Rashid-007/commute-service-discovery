#!/bin/sh
echo "********************************************************"
echo "Starting the Commute Service Discovery"
echo "********************************************************"
java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/commute-service-discovery/*.jar
