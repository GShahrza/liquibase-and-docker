FROM adoptopenjdk/openjdk11
ARG JAR_FILE=/build/libs/spring-docker-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]

#EXPOSE 8080

#COPY ${JAR_FILE} /app/
#WORKDIR /app
#CMD ["java","-jar","${JAR_FILE}"]