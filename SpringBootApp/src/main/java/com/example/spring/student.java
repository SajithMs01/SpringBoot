package com.example.spring;

import org.springframework.stereotype.Component;

@Component
public class student 
{
	private String name;
	private String id;
	
	public student()
	{
		System.out.println("student bean is created!");
	}
	
	public void StudentBean()
	{
		name = "Virat";
		id = "101";
		System.out.println(name + "---->" + id);
	}
	
}
