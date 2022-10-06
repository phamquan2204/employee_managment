package com.employeesmanagment.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeesmanagment.employee.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
