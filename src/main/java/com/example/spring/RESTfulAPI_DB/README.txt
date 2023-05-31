RestApi

This RestApi is using "resources >>> application.properties" to make a connection with the database

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