# Training-Java-Spring
This is a simple java app to make some tests

The app connect to a local SQL database. To remove that part you should comment the "spring-boot-starter-data-jpa" dependency in the "pom.xml" file
You also need to comment all JPA related code (package JPA_ORM) and some code in the main file TrainingJavaSpringApplication

# Setup of the project

# local run
## Envrionment variables
The file .env is use for environment variables
you need to tell intellij to take it in you run configuration

# docker-compose
## Build

Build the local application. Since the dockerfile reference the target (packaged) app, the app need to be package before running the build

```
docker-compose build
```

## Start services

This command start all service list in the docker compose

```
docker-compose up
```

## Run a command in the running container

This command is run inside the container and give the output of it. In the foloowing example the environment variables are listed

```
docker exec training-java-spring-app-1 printenv
```

# Docker (use docker-compose instead)
## Build
```
docker build -t nictoul/customfinalnicname:v1 .
```
nictoul is my github user account because when I logged in with
``docker login`` I logged in with github

## Run docker

```
docker run -p 8081:8081 nictoul/customfinalnicname:v1
```