package com.janawat.Springbootpagination;

import com.janawat.Springbootpagination.Repository.EmployeeRepository;
import com.janawat.Springbootpagination.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootPaginationApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostConstruct
	public void createInitialData() {

		List<Employee> lsEmployee= new ArrayList<>();
		lsEmployee.add(new Employee ("Nuchit1",  "Atjanawat1", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit2",  "Atjanawat2", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit3",  "Atjanawat3", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit4",  "Atjanawat4", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit5",  "Atjanawat5", "nuchit@outlook.com"));

		lsEmployee.add(new Employee ("Nuchit6",  "Atjanawat6", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit7",  "Atjanawat7", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit8",  "Atjanawat8", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit9",  "Atjanawat9", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit10",  "Atjanawat10", "nuchit@outlook.com"));

		lsEmployee.add(new Employee ("Nuchit11",  "Atjanawat11", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit12",  "Atjanawat12", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit13",  "Atjanawat13", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit14",  "Atjanawat14", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit15",  "Atjanawat15", "nuchit@outlook.com"));

		lsEmployee.add(new Employee ("Nuchit16",  "Atjanawat16", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit17",  "Atjanawat17", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit18",  "Atjanawat18", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit19",  "Atjanawat19", "nuchit@outlook.com"));
		lsEmployee.add(new Employee ("Nuchit20",  "Atjanawat20", "nuchit@outlook.com"));



		employeeRepository.saveAll(lsEmployee);

	}




	public static void main(String[] args) {
		SpringApplication.run(SpringBootPaginationApplication.class, args);
	}

}
