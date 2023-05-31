Model: The model represents the data and business logic
of your application. It encapsulates the data structures
and methods to interact with the data. In the context of
a RESTful API, the model typically corresponds to the entities
or data objects that you want to expose and manipulate.
The model classes define the structure and behavior of these entities.

Controller: The controller acts as an intermediary between the client
(request) and the model. It receives incoming requests, processes them,
and interacts with the model to retrieve or manipulate data.
The controller contains the request mapping methods that define the API
endpoints and their corresponding actions. It handles the request
parameters, calls the appropriate service methods, and prepares the response.

Service: The service layer provides a higher level of abstraction and encapsulates
the business logic of your application. It contains the service classes that define
the operations and rules for manipulating the data. The service layer acts as a
bridge between the controller and the model, handling complex operations,
transaction management, validation, and other business-specific tasks. It helps to
keep the controller lean and focuses on request handling.