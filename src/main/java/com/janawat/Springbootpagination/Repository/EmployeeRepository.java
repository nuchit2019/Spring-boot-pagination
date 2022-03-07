package com.janawat.Springbootpagination.Repository;

import com.janawat.Springbootpagination.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository
extends PagingAndSortingRepository<Employee, Long> {
}
