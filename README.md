# Spring boot pagination and sorting

### Create Project
- https://start.spring.io/
![alt text](https://github.com/nuchit2019/Spring-boot-pagination/blob/main/images/CreateProject.jpg?raw=true)

### Step
1. Create Employee Model
2. Create EmployeeRepository
3. Create EmployeeService
4. Create EmployeeController

### 
Configuration -  H2 Database
change application.properties => application.yml

### Run
1. http://localhost:8080/employees
2. http://localhost:8080/employees?pageSize=5
3. http://localhost:8080/employees?pageSize=5&pageNo=1
4. http://localhost:8080/employees?pageSize=5&pageNo=2
5. http://localhost:8080/employees?pageSize=5&pageNo=1&sortBy=email
6. http://localhost:8080/employees?pageSize=5&pageNo=1&sortBy=firstName

### The end.