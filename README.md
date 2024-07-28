# User Service for E-commerce Application

This project is a User Service for an e-commerce clothing application. The User Service is designed to manage user accounts, enabling functionalities such as user registration, authentication, and profile management. By centralizing user management, it ensures a secure and consistent experience across the e-commerce platform.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Service](#running-the-service)
- [Contributing](#contributing)
- [License](#license)

## Overview

The User Service is a RESTful API built using Spring Boot. It offers endpoints for user registration, authentication, profile updates, and account management. This service plays a crucial role in the e-commerce system by ensuring secure and efficient user management.

## Features

- **User Registration:** Allows new users to register with the platform.
- **User Authentication:** Enables users to log in and access their accounts securely.
- **Profile Management:** Supports updating user profile information.
- **Account Management:** Facilitates operations like password reset and account deactivation.

## Prerequisites

- Java 17 or higher
- Maven 3.6.3 or higher
- Spring Boot 3 or higher

## Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/Agustin199811/user-service.git
    cd user-service
    ```

2. Build the project using Maven:

    ```sh
    mvn clean install
    ```

## Configuration

The configuration for the User Service is located in `src/main/resources/application.properties`. Below is an example configuration:

```properties
spring.datasource.url=jdbc:postgresql://clot.cp88o8squjfi.us-east-1.rds.amazonaws.com:3306/clot
spring.datasource.username=root
spring.datasource.password=root1234
```

## Running the Service

To run the service registry, use the following command:

 ```sh
    mvn spring-boot:run
```

## Contributing

Contributions are welcome! If you would like to contribute to this project, please send us an email at
`toapantaagustin9c@gmail.com` with details about your proposed changes or improvements. We look forward to hearing from you!

## License

This project is licensed under the MIT License - see the LICENSE file for details.
