# Stage 1: Build the application using Maven and JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# Set the working directory
WORKDIR /app

# Copy the Maven project definition file
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the project and create the executable JAR file
# The "-DskipTests" flag is used to speed up the build process
RUN mvn clean package -DskipTests

# Stage 2: Create the final, lightweight runtime image
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

# Copy the executable JAR from the 'builder' stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]