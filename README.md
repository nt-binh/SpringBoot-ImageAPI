#Rest Image API

This API is used to request and store the image using Rest API <br>

##Installation
Need to install jdk and maven before running the application

```
sudo apt-get install openjdk-7-jre
sudo apt-get install maven
```

The application can be run directly from maven: `mvn spring-boot:run`, or creating the jar package with `mvn clean package` and then run it: `java -jar target/Images-API-1.0-SNAPSHOT.jar`.

##Endpoint
The endpoints for the API are `/api/photos` and `/api/albums`.
```
http://localhost:8080/api/photos
```
The result is

```
[
  {
    "id": "1",
    "title": "p8",
    "createdDate": "2020-08-31T09:14:05.097-0500",
    "filePath": "p8.jpg",
    "albumId": "1"
  },
  {
    "id": "2",
    "title": "p024_splume",
    "createdDate": "2020-08-31T09:14:05.097-0500",
    "filePath": "p024_splume.png",
    "albumId": "1"
  },
  {
    "id": "3",
    "title": "p043_wood",
    "createdDate": "2020-08-31T09:14:05.098-0500",
    "filePath": "p043_wood.png",
    "albumId": "1"
  },
  {
    "id": "4",
    "title": "p043_wood_diagonal",
    "createdDate": "2015-08-31T09:14:05.098-0500",
    "filePath": "p043_wood_diagonal.jpg",
    "albumId": "2"
  }
]
```
