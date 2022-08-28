FROM openjdk:8
VOLUME /tmp
EXPOSE 9898
ADD target/customer-application.jar customer-application.jar
ENTRYPOINT ["java" ,"-jar", "/customer-application.jar"]