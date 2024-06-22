Java Version - 17
Database - h2 Database and stored in data file
IDE - STS eclipse


Deployment instruction.
1. Clone the project from github <URL>
2. Import the project as maven project in eclipse.
3. Change the compiler on eclipse to java 17 version
4. Update maven repository.
5. Run as java application.
6. Upon runtime, H2 database will be created on memory level.



Testing:
Postman collection is include.
Use that collection for testing.
Sample request is already in the collection.


Abouts:
This application using springboot framework.
It uses H2 Database to simplify the database set up since it only use memory.
Also uses Spring JPA repository to eliminate the prepared Statement for SQL script.
as commonly use, developer uses the maven dependency.

This simple application can do the basic CRUD using the HTTP methods to assign action on resource.
