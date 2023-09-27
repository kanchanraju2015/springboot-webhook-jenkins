package com.briz.springbootwebhookjenkins;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
	return "this is jenkins test";
}
@RequestMapping("/save")
public String savedata()
{
	Employee e=new Employee();
	e.setAge(12);
	e.setCity("tata");
	e.setCountry("india");
	e.setName("goutam");
	erepo.save(e);
	return "data saved to database";
}
@RequestMapping("/all")
public List<Employee> allemployees()
{
	return erepo.findAll();
}
@RequestMapping("/by/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return erepo.findById(id);
}
}
