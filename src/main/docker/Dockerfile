# To execute the shipped application, a java runtime is required
# Use an openjdk runtime by refering to image tag of openjdk on docker hub

FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/commute-service-discovery
ADD *.jar /usr/local/commute-service-discovery/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh

