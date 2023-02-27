package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	public EmployeeEntity create (EmployeeEntity employee) {
		return employeeRepository.save(employee);
	}
	
	public Optional<EmployeeEntity> read(Long id){
		return employeeRepository.findById(id);
	}

	public EmployeeEntity update(EmployeeEntity employee) {
		
		return employeeRepository.save(employee);
	}

	public String delete(Long id) {
		
		employeeRepository.deleteById(id);
		return "data deleted";
	}
	
}