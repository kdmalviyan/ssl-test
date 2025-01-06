FROM maven:3.9-amazoncorretto-21

WORKDIR /ssl-test
COPY . .
#RUN mvn clean install
EXPOSE 8443
CMD mvn clean spring-boot:run -Dspring-boot.run.profiles=docker