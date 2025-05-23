# Advanced Java Assignment Repository

This repository contains a series of Java programming labs focused on core Java concepts, Swing GUI, Servlets, JSP, JDBC, and web session management. Each lab folder includes source code, example outputs, and resources to practice and understand advanced Java topics.

---

## 📂 Folder Structure Overview

- **Lab1 ArrayList and LinkedList**  
  Java programs demonstrating usage of `ArrayList` and `LinkedList` collections.

- **Lab2 String Operations**  
  Programs performing various string manipulations and performance testing.

- **Lab3 String Modification**  
  Exercises covering string operations such as palindrome checking, counting occurrences, trimming whitespace, etc.

- **Lab4 Swing Programs 1**  
  Introduction to Swing GUI programming with basic components.

- **Lab5 Swing Programs 2**  
  Advanced Swing programs featuring layouts, event handling, and components.

- **Lab6 Servlet Programs**  
  Servlet-based web applications demonstrating request handling and response generation.

- **Lab7 Session and Cookie Management**  
  Web applications demonstrating HTTP sessions, cookies, and state management.

- **Lab8 JDBC JSP Programs 1**  
  Basic JDBC and JSP programs for database connectivity and dynamic web content.

- **Lab9 JDBC JSP Programs 2**  
  Advanced JDBC and JSP applications, including CRUD operations and connection pooling.

---

## 🛠️ Prerequisites

- **JDK 11 or above** installed and configured on your system.
- **Apache Tomcat Server** (version 9 or above recommended) for running Servlet and JSP programs.
- **XAMPP** for MySQL database server and phpMyAdmin.
- **MySQL JDBC Connector (Connector/J)** to enable JDBC connectivity.
- A code editor or IDE like **Eclipse**, **IntelliJ IDEA**, or **VS Code**.

---

## 🚀 How to Run the Programs

### 1. Setup MySQL Database Using XAMPP and phpMyAdmin

- Start **XAMPP Control Panel** and start **Apache** and **MySQL** modules.
- Open your browser and navigate to [http://localhost/phpmyadmin](http://localhost/phpmyadmin).
- Create a new database for your lab projects (e.g., `labdb`).
- Create necessary tables according to the project requirements (refer to individual lab README or source code for schema).
- Note the database name, username (default is `root`), and password (default is empty) for JDBC connection.

### 2. Configure JDBC MySQL Connector

- Download MySQL Connector/J from the official MySQL site:  
  https://dev.mysql.com/downloads/connector/j/
- Add the MySQL JDBC driver JAR (`mysql-connector-java-xxx.jar`) to your project’s classpath.
  - In **Eclipse**: Right-click project > Build Path > Configure Build Path > Libraries > Add External JARs.
  - In **IntelliJ IDEA**: File > Project Structure > Libraries > Add the JAR.

### 3. Setup Apache Tomcat Server

- Download and install Apache Tomcat: https://tomcat.apache.org/
- Configure your IDE to use Apache Tomcat as the server runtime.
- Deploy your web projects (Servlets/JSPs) to the Tomcat server.
- Start the Tomcat server from the IDE or the Tomcat `bin` directory using:

- Access your web applications at:  
`http://localhost:8080/YourAppName`

### 4. Running Java Console or GUI Programs

- For simple Java programs (Lab1, Lab2, Lab3, Lab4, Lab5):
- Compile and run them directly in your IDE or via command line.
- Example (command line):
  ```
  javac YourProgram.java
  java YourProgram
  ```

### 5. Running Servlet and JSP Programs (Lab6 to Lab9)

- Place the project folder inside Tomcat's `webapps` directory or deploy via your IDE.
- Ensure JDBC connector JAR is included in the `WEB-INF/lib` directory of your web application.
- Configure database connection parameters inside your Servlet or DAO classes.
- Start Tomcat and access the applications through the browser.

---
