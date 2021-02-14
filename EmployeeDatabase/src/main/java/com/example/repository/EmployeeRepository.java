package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	
}
