FROM maven:3.8.4-openjdk-11-slim AS salary
RUN mkdir /salary-build
WORKDIR /salary-build
COPY . .
RUN mvn clean package -Dmaven.test.skip



FROM openjdk:11
RUN mkdir /salary-run
WORKDIR /salary-run
COPY --from=salary /salary-build/target/equipe2-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "equipe2-0.0.1-SNAPSHOT.jar"]