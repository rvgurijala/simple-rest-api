#simple rest api by using spring boot

#run
Maven package

```
$ mvn package
```

docker build
```
go to project folder
$ docker-compose build
```

docker up
```
go to project folder
$ docker-compose up
```

Application will start on port 9090

Sample endpoints:

```
GET: http://localhost:9090/api/v1/persons/1 -- get person
POST: http://localhost:9090/api/v1/persons -- create person
PUT: http://localhost:9090/api/v1/persons/1 -- update person
DELETE: http://localhost:9090/api/v1/persons/1 -- DELETE person
```