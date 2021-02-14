package com.example.service;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.example.model.Employee;
import com.example.pattern.RegexMatch;
import com.example.repository.CustomMethod;
import com.example.repository.EmployeeRepository;

import javassist.bytecode.Descriptor.Iterator;

@Service
@ComponentScan
public class EmployeeServiceImpl
{
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployee()
	{
		List<Employee> employee=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee1 ->employee.add(employee1));
		return employee;
	}
	public Employee getEmployeeById(int id)
	{
		return employeeRepository.findById(id).get();
	}
	public void save(Employee employee)
	{
		employeeRepository.save(employee);
	}
	public void delete(int id)
	{
		employeeRepository.deleteById(id);
	}
	public void update(Employee employee)
	{
		employeeRepository.save(employee);
	}
	public List getMatch(String name) 
	{
		RegexMatch r=new RegexMatch();
		List employee=r.getMatchPattern(name);
		return employee;
	}
}
