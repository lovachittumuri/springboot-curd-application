FROM eclipse-temurin:17-jdk
WORKDIR /myAPP
COPY ./target/curd-application.jar /myAPP
EXPOSE 9191
CMD ["java","-jar","curd-application.jar"]
