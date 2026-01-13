# Project 3 – Task Manager API

##
This project is a continuation of building
my java foundation for backend progression. This
poject is a simple task manager that uses gradle
and spring boot. The endpoints are listed below.

## Endpoints
POST   /tasks         (create task)
GET    /tasks         (list tasks)
GET    /tasks/{id}    (get task)
POST  /tasks/{id}    (mark done)
DELETE /tasks/{id}    (delete task)

## Example curl
curl -X POST http://localhost:8080/tasks -d "Buy milk"
