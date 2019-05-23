############################
### Base for build image ###
############################
FROM gradle:jdk11 AS build

MAINTAINER Felix Klauke <info@felix-klauke.de>

######################
### Copy all files ###
######################
COPY . .

################
### Build it ###
################
RUN ./gradlew build

########################
### Base for runtime ###
########################
FROM openjdk:11 AS runtime

WORKDIR /opt/app

COPY --from=build server/build/libs/avalance-server.jar /opt/app/server.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "server.jar" ]

