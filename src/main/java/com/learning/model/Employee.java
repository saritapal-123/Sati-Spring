package com.learning.model;

import java.util.List;

import java.util.Map;
import java.util.Set;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private int id;
	private String name, gender;
	private int salary;
	private Address address;
	
	
	private List<Integer> list;
	private Set<Integer> set;
	private Map<Integer, String> map;
	
	
	
		
	
	
	
}
