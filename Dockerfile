# BUILD

FROM maven:3-eclipse-temurin-25-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# RUNTIME

FROM eclipse-temurin:25-jre-alpine AS runtime

RUN addgroup -S springboot && adduser -S -G springboot springboot

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

RUN chown -R springboot:springboot /app

USER springboot

ENTRYPOINT ["java", "-jar", "app.jar"]
