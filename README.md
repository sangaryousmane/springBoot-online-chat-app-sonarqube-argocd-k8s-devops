# Complete DevOps with Spring boot: Building a simple chat application

This guide provides step-by-step details to set up an end-to-end Jenkins pipeline for a Java application using SonarQube, Argo CD and Kubernetes.

## Technologies Used:
1. Openjdk 17
2. Maven
3. Spring Web socket
4. Docker for containerizing our 
5. Kubernetes for deploying our application
6. Argo CD
7. SonarQube for static code analysis
8. Jenkins for building a complete CICD pipeline 
9. AWS(Amazon Web Services) - EC2 instances, IAM, Security management
Multiple user, roles and group management

# Steps to implement the CICD pipeline
#### NB: I used AWS EC2 instance in this project, but you can do everything locally if you want
1. Install the necessary Jenkins plugins:
* Git plugin 
* Maven Integration plugin(here we are using a docker image which has maven pre-installed so this is optional)
* Docker Pipeline plugin 
* Sonarqube scanner plugin

2. Create a new Jenkins pipeline:
* In Jenkins, create a new pipeline job and configure it with the Git repository URL for the Java application.
* Add a Jenkinsfile to the Git repository to define the pipeline stages.

3. Configure Jenkins pipeline stages:
* Stage 1: Use the Git plugin to check out the source code from the Git repository. 
* Stage 2: Use the Maven Integration plugin to build the Java application. 
* Stage 3: Use the SonarQube plugin to analyze the code quality of the Java application. 
* Stage 4: Use the Maven Integration plugin to package the application into a JAR file. 
* Stage 5: Use Argo CD to deploy the application onto a kubernetes cluster(here we are using 2 replica pods).

## Check the demo of the app below
![img.png](src/main/resources/static/images/home_page.png)

### How to use the app locally
1. Clone the repository here: ``https://github.com/sangaryousmane/springBoot-online-chat-application.git``
2. Navigate to the ``src\main\java\com\alibou\websocket`` and start the project
3. Access the application through this link: http://localhost:9500. You can change the port number in the config file