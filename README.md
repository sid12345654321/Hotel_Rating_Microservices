This project is a microservices-based application for managing hotel ratings. It consists of multiple independent services that communicate with each other to provide seamless functionality. The architecture includes the following services:

HotelService: Manages hotel information.

RatingService: Manages user ratings and reviews for hotels.

APIGateway: Acts as a single entry point to route client requests to the appropriate services.

ConfigServer: Centralized configuration management for all microservices.

ServiceRegistry: Service discovery for enabling communication between microservices.


Technologies Used

Java 17

Spring Boot (2.7+)

Spring Cloud (Netflix Eureka, Config Server, Gateway)

H2 Database (or MySQL/PostgreSQL for production)

Hibernate/JPA

Maven

Docker (Optional, for containerization)

Postman (for API testing)

Architecture Overview

The application follows a microservices architecture, where each service performs a specific function. Communication between services is facilitated using REST APIs and service discovery. Below is the architecture diagram:

+----------------+    +------------------+    +----------------+
| Hotel Service  |    | Rating Service   |    |  Config Server |
|   (Backend)    |    |   (Backend)      |    |   (Central)    |
+----------------+    +------------------+    +----------------+
       |                      |                      |
       +--------------------------------------------+
                            |
                  +-------------------+
                  |   API Gateway     |
                  +-------------------+
                            |
                  +-------------------+
                  | Client Applications|
                  +-------------------+
