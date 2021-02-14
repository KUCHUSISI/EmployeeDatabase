package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface CustomMethod 
{
	@Query("select empNamae from Employee where empname='%?%'")
	List getEmployeeByMatch(@PathVariable("Kuchu") String Kuchu);
}
