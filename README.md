# Spring Boot + Kafka Demo Project

This project develops a simple messaging system using **Spring Boot** , **Docker** and **Kafka**.

## Table of Contents
- [Technologies](#technologies)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)


## Technologies

- Java 17
- Spring Boot 3.3.4
- Apache Kafka 3.7.0
- Docker and Docker Compose

## Features
- Send and receive messages with Kafka
- Develop REST API with Spring Boot
- Set up Kafka and Zookeeper with Docker

## Installation

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/project-name.git
    cd project-name
    ```

2. Install the required dependencies (if using Maven):

    ```bash
    mvn install
    ```

3. Run Kafka and Zookeeper with Docker:

    ```bash
    docker-compose up
    ```

4. Start the project:

    ```bash
    mvn spring-boot:run
    ```

5. Open the application in your browser:

    ```bash
    http://localhost:8080
    ```

## Usage

### Sending a Kafka Message

To send a message, use the following GET request:

```bash
http://localhost:8080/send?message=HelloKafka
