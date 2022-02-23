FROM maven:3.8.4-openjdk-11-slim AS readjustment
RUN mkdir /readjustment-build
WORKDIR /readjustment-build
COPY . .
RUN mvn clean package -Dmaven.test.skip



FROM openjdk:11
RUN mkdir /readjustment-run
WORKDIR /readjustment-run
COPY --from=readjustment /readjustment-build/target/Readjustment-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "Readjustment-0.0.1-SNAPSHOT.jar"]