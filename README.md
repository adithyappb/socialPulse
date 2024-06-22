## Social Media Analytics Platform with Big Data and Machine Learning

# Project Overview

This project involves building a social media analytics platform that collects data from various social media platforms, processes it using Apache Spark, and performs sentiment analysis using a machine learning model deployed with Spring Boot.

# Technologies Used

- Java, Spring Boot
- Apache Spark
- Kafka
- HDFS
- TensorFlow 
- Docker, Kubernetes
- Maven
- REST APIs
- CI/CD with Jenkins
- HTML, JavaScript (React for frontend)

# Setup Instructions

# Prerequisites

- Java JDK 8 or higher
- Apache Maven
- Docker
- Kubernetes 

# Running the Application

1. **Backend Service:**
   - Navigate to `backend/` directory.
   - Build the Spring Boot application using Maven: `mvn clean install`.
   - Run the backend service: `java -jar target/analytics.jar`.

2. **Data Processor (Apache Spark):**
   - Navigate to `data-processor/` directory.
   - Build the Scala application using SBT: `sbt assembly`.
   - Submit the Spark job: `spark-submit --class com.example.analytics.SparkProcessor target/spark-processor.jar`.

3. **Machine Learning Model:**
   - Train and save the sentiment analysis model using TensorFlow or another ML framework.
   - Deploy the model: `python ml-model/src/main/python/sentiment_analysis.py`.

4. **Docker Compose:**
   - Start all services using Docker Compose: `docker-compose up -d`.

# Accessing the Application

- Backend API: `http://localhost:8080`
- Spark Processor: Integrated with Docker Compose
- Machine Learning Model: Integrated with Docker Compose

# Additional Notes

- For detailed configurations and environment setup, refer to individual service directories (`backend/`, `data-processor/`, `ml-model/`).
- Modify configurations (`application.properties`, `KafkaConfig.java`, etc.) as per your deployment environment and requirements.
- Ensure Docker and Kubernetes configurations align with your deployment strategy.
