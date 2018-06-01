package com.maciej.DemoCv.repositories;

import com.maciej.DemoCv.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
