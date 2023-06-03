What is a RESTful API?
+ plus difference between the two examples that are provided

Every RESTful API consist of three parts:
Model, Controller and Service

1. Model
Represents the data that is exchanged between the service (example: database) and the user.
Also, it gives a structure and the behavior of the data.

2. Controller
Handles the user requests and process them.
It is responsible for receiving the requests, extracting the necessary data,
invoking the appropriate business logic, and preparing the response to send back to the client.
(Handles: GET, POST, PUT, DELETE)

3. Service
Contains the business logic.
The service layer is responsible for implementing the application-specific
rules and logic. It helps to decouple the controller from the details of
data access and manipulation.

....................................................................................................................

Difference between the RestApi_JPA and RestApi_JDBC

RestApi_JPA

This RestApi_JPA is using "resources >>> application.properties" to make a connection with the database

Advantage:
- convention-over-configuration principle
- centralized configuration management
- easy update of the DB details without code
- separation of concerns
- easier to understand and maintain code

Disadvantage:
- limited flexibility
- cannot connect to multiple DB
- does not have dynamic configuration requirements

....................................................................................................................

RestApi_JDBC

This RestApi_JDBC is using "ConnectJDBC and DatabaseConfiguration" classes to make a connection with the database

Advantage:
- flexibility
- more control over the DB configuration
- customization
- can set connection pool properties
- can add interceptors

Disadvantage:
- increase complexity
- need to handle dynamic configuration
