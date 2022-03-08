# Spring boot pagination and sorting

### Create Project
- https://start.spring.io/
- 1. create project from spring initializr
- 2. Add Dependencies ... Spring Web, Spring Data JPA, H2 Database
- 3. Click Button GENERATE CTRL+ENTER
- 4. Save project file *.zip
- 5. Extrace All...
- 6. Open Project with IntelliJ IDEA
- 7. End
![alt text](https://github.com/nuchit2019/Spring-boot-pagination/blob/main/images/CreateProject.jpg?raw=true)

### Step
1. Create Employee Model
2. Create EmployeeRepository
3. Create EmployeeService
4. Create EmployeeController

### 
Configuration -  H2 Database
change application.properties => application.yml
```
spring:
  h2:
    console:
      enabled: true
      path: /h2
  datasource:
    url: jdbc:h2:mem:sampledb
    username: root
    password:
    driverClassName: org.h2.Driver
  Jpa:
    database-platform: org.hibernate.dialect.H2Dialect
```

### Run
1. http://localhost:8080/employees
2. http://localhost:8080/employees?pageSize=5
3. http://localhost:8080/employees?pageSize=5&pageNo=1
4. http://localhost:8080/employees?pageSize=5&pageNo=2
5. http://localhost:8080/employees?pageSize=5&pageNo=1&sortBy=email
6. http://localhost:8080/employees?pageSize=5&pageNo=1&sortBy=firstName

### The end.