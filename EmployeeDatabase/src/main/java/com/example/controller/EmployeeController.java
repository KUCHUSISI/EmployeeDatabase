package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.CustomMethod;
import com.example.service.EmployeeServiceImpl;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeServiceImpl employeeservice;
	@GetMapping("/employee")
	private List<Employee> getAllEmplloyee()
	{
		return employeeservice.getAllEmployee();
	}
	@GetMapping("/employee/{id}")
	private Employee getEmployee(@PathVariable("id") int id )
	{
		return employeeservice.getEmployeeById(id);
	}
	@DeleteMapping("/employee/{id}")
	private void deleteEmployee(@PathVariable("id") int id)
	{
		employeeservice.delete(id);
	}
	@PostMapping("/employee")
	private int save(@RequestBody Employee employee)
	{
		employeeservice.save(employee);
		return employee.getId();
	}
	@PutMapping("/employee")
	private Employee update(@RequestBody Employee employee)
	{
		employeeservice.save(employee);
		return employee;
	}
 	@GetMapping("/employee/search/{string}")
	public List getEmployeeByMatch(@PathVariable("string") String string) 
 	{
 		return employeeservice.getMatch(string);
	}
}