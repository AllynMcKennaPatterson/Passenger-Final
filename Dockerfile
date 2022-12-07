FROM openjdk:15
COPY target/classes/ /tmp
WORKDIR /tmp
CMD java ie.atu.Passenger