package com.briz.springbootwebhookjenkins;

import org.springframework.beans.factory.annotation.Autowired;
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
}
