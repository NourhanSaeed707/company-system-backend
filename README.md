# company-system-backend
## Introduction:
- Welcome to the company system project! This project is designed to help an admin manage employees and departments within a company.
- The system allows the admin to perform various tasks related to employee and department management, such as creating, editing, deleting, and getting one employee, as well as assigning employees to departments. The admin can also create, update, delete, and get departments, and view all employees belonging to a specific department.
- To ensure that only authorized users can access the system, we have implemented Spring Security. This means that all URLs in the application are secured and can only be accessed by an authenticated admin.

- The project is built using Spring Boot, which provides a powerful platform for building web applications. We are using MySQL as the database to store employee and department information

## Features: 
1. Employee management: The system allows the admin to create, edit, delete, and get one employee. The admin can view all employees in the system or search for a specific employee by name or department. 
2. Department management: The admin can create, update, delete, and get departments in the system. The admin can also view all employees belonging to a specific department.
3. Employee-Department relationship: The admin can assign an employee to a department, and view all employees belonging to a specific department.
4. URL security: All URLs in the application are secured and can only be accessed by an authenticated admin. This is achieved using Spring Security, which restricts access to certain features and ensures that only authorized users can access the system.
5. Spring Boot: The project is built using Spring Boot, which provides a powerful platform for building web applications. This allows us to easily manage dependencies, configure the application, and launch the application.
6. MySQL: The system uses MySQL as the database to store employee and department information. This provides a reliable and scalable solution for managing data.

## Technologies:
1. Spring Boot: Spring Boot is a powerful framework that provides a platform for building web applications. It simplifies the process of creating and deploying applications by providing a pre-configured environment for developers.
2. MySQL: MySQL is an open-source relational database management system. It is used to store employee and department information in the system.
3. Spring Security: Spring Security is a powerful and highly customizable authentication and access-control framework. It is used to secure the URLs in the application and restrict access to certain features.
4. Java: Java is a high-level programming language that is widely used for building enterprise-grade applications. It is the primary language used in the project.
5. Maven: Maven is a build automation tool that is used to manage dependencies and build the application.
6. Git: Git is a version control system that is used to manage the source code for the project. It allows developers to collaborate on the project and keep track of changes to the code

## Get started:
1. Clone the repository: Start by cloning the company system project repository to your local machine using Git.
2. Install dependencies: Next, make sure you have all the necessary dependencies installed on your machine. The project uses Maven to manage dependencies, so you can run mvn clean install to install all the required dependencies.
3. Configure the database: The project uses MySQL as the database, so you'll need to create a MySQL database and configure the connection details in the application.properties file. You can find this file in the src/main/resources folder.
4. Launch the application: Once you have installed the dependencies and configured the database, you can launch the application by running the CompanySystemApplication.java file, which can be found in the src/main/java/com/company/system folder. You can run the application from your IDE or by running the command mvn spring-boot:run from the command line.
5. Access the application: Once the application is running, you can access it by opening a web browser and navigating to http://localhost:8080/. You will be prompted to log in with an admin account. You can create an admin account by running the SQL script data.sql in the src/main/resources folder.

## Security:
- Authentication: When a user tries to access the application, they are prompted to enter their username and password. These credentials are then checked against the user database to ensure that they are valid. If the credentials are valid, the user is authenticated and granted access to the application.

- Authorization: Once a user is authenticated, their authorization level is checked to determine what actions they are allowed to perform. In the case of the company system project, only admins are authorized to access certain areas of the application, such as the employee and department management pages.

- URL security: All URLs in the application are secured and can only be accessed by an authenticated admin. This is achieved by using Spring Security to define access rules for each URL. For example, we might define a rule that says only admins can access the employee management page.

- User roles: We are using user roles to determine what actions a user is allowed to perform. For example, an admin might have full access to the application, while a regular user might only be able to view certain pages.

- Password encryption: Passwords are encrypted before they are stored in the database using a one-way hash function. This ensures that even if the database is compromised, the passwords cannot be easily decrypted.

## Tools:
- java 17
- mvn 3.1.0

## Dependency:
- Spring Web
- Spring Security
- Spring Data JPA
- Spring Data JDBC
- MySQL Driver
