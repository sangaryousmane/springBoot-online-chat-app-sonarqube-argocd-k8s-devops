# Spring Boot 3.0 Web Socket
This project demonstrates the implementation of websocket using Spring Boot 3.0 with live chat system. It includes the following features:

## Features
* User start chat by adding their username
* There is signal when a particular user join


## Technologies
* Spring Boot 3.0
* Spring Websocket
* Spring developer tools
* Lombok
* Maven
* GitHub CI/CD workflows
* Docker
* Kubernetes

## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+


To build and run the project, follow these steps:

* Clone the repository: `git clone https://github.com/ali-bouali/spring-boot-3-jwt-security.git`
* Navigate to the project directory: cd spring-boot-security-jwt
* Add database "playground" to postgres
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run
* Please note that there is CI/CD support that build, test and deploy your docker image to docker hub for you
  -> The application will be available at http://localhost:8080.
* All manifest file relating to k8s can be found in the /k8s directory
Navigate there and get some insight of the configuration
