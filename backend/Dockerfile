############################################
# Backend Dockerfile (Development Version) #
############################################
FROM openjdk:21-jdk-slim

# Install Maven
RUN apt-get update && apt-get install -y maven && apt-get clean

# Set the working directory in the container
WORKDIR /app

# Copy the entire project directory into the container
COPY . /app

# Run Maven command to start the application in development mode
CMD ["mvn", "spring-boot:run"]

# Note: The Maven dependency cache will not persist between builds.
# This is intentional for live development where dependencies might change.