package com.xworkz.toy.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.toy.dto.ToyDto;

public interface ToyService {

	

	   Set<ConstraintViolation<ToyDto>> saveAndValidate(ToyDto dto);
	   
	   default ToyDto findById(int id) {
		   return null;
	   }

	default List<ToyDto> findByCompany(String company){
	 return null;
	 
	 }

	Set<ConstraintViolation<ToyDto>> validateAndUpdate(ToyDto dto);
	
	 }
