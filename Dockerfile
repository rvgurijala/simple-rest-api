FROM java:8-jdk-alpine

COPY ./target/simple-rest-api-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch simple-rest-api-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","simple-rest-api-0.0.1-SNAPSHOT.jar"]