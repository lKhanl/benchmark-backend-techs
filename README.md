# benchmark-backend-techs

## Description

This is a benchmark of the backend technologies. The goal is to compare the performance of the technologies in terms of the number of requests per second.

## Technologies
- [Go Gin](https://go.dev/)
- [Spring Boot](https://spring.io/projects/spring-boot)

## How to run

Docker compose is used to run the applications. To run the applications, run the following command:

```bash
docker-compose up --build
```

## How to test

To test the applications, request the following URL:

```bash
curl http://localhost:1000
```