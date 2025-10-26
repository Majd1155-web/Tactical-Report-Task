# Backend - Spring Boot API

REST API for item management using Spring Boot and MongoDB.

## Run with Docker

From project root:
```bash
docker-compose up --build
```

## Run Locally
```bash
# Start MongoDB
docker run -d -p 27017:27017 mongo:latest

# Run application
./gradlew bootRun
```

API runs on http://localhost:8080

## Build
```bash
./gradlew build
```