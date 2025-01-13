# Training-Java-Spring

# Setup of the project
To run it with an IDE there is 2 env. variables that need to be configured
```
DB_USERNAME=sa;DB_PASSWORD=p0o9i8u7
```
# local run
## Envrionment variables
The file .env is use for environment variables

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