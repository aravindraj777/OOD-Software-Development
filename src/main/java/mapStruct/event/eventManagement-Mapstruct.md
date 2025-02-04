# Event Management System - MapStruct Mapping Techniques

This project is a demonstration of various **MapStruct mapping techniques** used to map between entity classes and Data
Transfer Objects (DTOs) in a java based application. The goal is to showcase how MapStruct can simplify the process of
mapping objects, and to illustrate different mapping strategies such as simple field mappings, custom mappings,
conditional mappings, default values, and formatting.

## Project Structure

The project is organized into the following modules:

### 1. `dto`

Contains Data Transfer Objects (DTOs) used to transfer data across different layers of the application.

- `EventDTO`: Represents the event data transfer object.
- `EventScheduleDTO`: Represents the schedule of an event.
- `ParticipantDTO`: Represents the participant data transfer object.
- `VenueDTO`: Represents the venue data transfer object.

### 2. `entities`

Contains entity classes that represent the database structure for events, participants, venues, and event schedules.

- `EventEntity`: Represents the event entity in the database.
- `EventScheduleEntity`: Represents the event schedule entity.
- `ParticipantEntity`: Represents the participant entity.
- `VenueEntity`: Represents the venue entity.

### 3. `enums`

Contains enumerations used in the project to represent different event types and registration statuses.

- `EventType`: Enum representing the types of events (e.g., Conference, Workshop, Concert).
- `RegistrationStatus`: Enum representing the registration status of participants (e.g., Registered, Pending).

### 4. `mapper`

Contains the MapStruct mappers for transforming between entities and DTOs.

- `EventMapper`: Mapper for converting `EventEntity` to `EventDTO` and vice versa, demonstrating various mapping
  techniques.
- `ParticipantMapper`: Mapper for converting `ParticipantEntity` to `ParticipantDTO` and vice versa, demonstrating
  custom mappings.

### 5. `service`

Contains service classes responsible for business logic and handling data between the controller and the repository.

- `EventService`: Service for handling event-related operations.
- `ParticipantService`: Service for handling participant-related operations.

## MapStruct Techniques Demonstrated

This project showcases the following MapStruct mapping techniques:

### 1. **Simple Field Mapping**

- Fields with the same name and type are mapped automatically by MapStruct without any extra configuration.

### 2. **Custom Mapping**

- **`@Mapping(qualifiedByName = "mapEventType")`**: Demonstrates how to map enum values to their string representation
  using a custom method.

### 3. **Date and Number Formatting**

- **`@Mapping(dateFormat = "dd-MM-yyyy HH:mm")`**: Demonstrates the formatting of `eventDate` to a custom date format.
- **`@Mapping(numberFormat = "$#.00")`**: Shows how to format a number, e.g., `ticketPrice`, to a currency format.

### 4. **Conditional Mapping with Expressions**

- **`@Mapping(expression = "java(event.getAttendees() > 100 ? \"Large Event\" : \"Small Event\")")`**: Demonstrates
  conditional mapping using Java expressions to set a field value dynamically.

### 5. **Default Values and Constant Mappings**

- **`@Mapping(constant = "500", target = "attendees")`**: Shows how to assign a constant value to a field during
  mapping.
- *
  *`@Mapping(target = "name", defaultExpression = "java(event.getName() == null ? \"Unnamed Event\" : event.getName())")`
  **: Demonstrates how to provide a default value using Java expressions.

## Technologies Used

- **Java**: Core programming language for implementing the backend logic.
- **MapStruct**: A code generator for mapping between Java bean types.
- **Maven**: Dependency management tool.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/aravindraj777/OOD-Software-Development.git
   
2. Entire MapStruct link :
    ```gitbub
   https://github.com/aravindraj777/OOD-Software-Development/tree/master/src/main/java/mapStruct
