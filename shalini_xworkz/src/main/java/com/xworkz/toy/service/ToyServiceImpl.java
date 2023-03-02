package com.xworkz.toy.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.toy.dto.ToyDto;
import com.xworkz.toy.entity.ToyEntity;
import com.xworkz.toy.repository.ToysRepository;
@Service
public class ToyServiceImpl implements ToyService {

	@Autowired
	public ToysRepository toysRepository;
	
	public ToyServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public Set<ConstraintViolation<ToyDto>> saveAndValidate(ToyDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<ToyDto>> violations = validator.validate(dto);
		
		if(violations !=null && !violations.isEmpty()) {
			System.out.println("Violations in dto "+dto);
			return violations;
		}else {
			System.out.println("Violations is not there in dto can save");
			
			ToyEntity entity = new ToyEntity();
			
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setColor(dto.getColor());
			 
			boolean saved = this.toysRepository.save(entity);
			System.out.println("Entity Data is saved "+saved);
			return Collections.emptySet(); 
		}
	}

	public ToyDto findById(int id) {
		if(id>0) {
			
			ToyEntity entity = this.toysRepository.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
				  ToyDto dto = new ToyDto();
                   dto.setCompany(entity.getCompany());
				   dto.setName(entity.getName());
				   dto.setCost(entity.getCost());
				   dto.setType(entity.getType());
				   dto.setColor(entity.getColor());
				   dto.setId(entity.getId());
				   
				  return dto;
			  }
			   
			}
			return null;
	}
	@Override
	public List<ToyDto> findByCompany(String Company){
		System.out.println("Running findbyName in service"+Company);
		if(Company!=null&& !Company.isEmpty()) {
			System.out.println("brandname is valid..calling repo");
			List<ToyEntity> entities=this.toysRepository.findByCompany(Company);
			
			List<ToyDto> listofDTO=new ArrayList<ToyDto>();
			for(ToyEntity entity:entities) {
				ToyDto dto=new ToyDto();
				dto.setName(entity.getName());
				dto.setCompany(entity.getCompany());
				dto.setType(entity.getType());
				dto.setCost(entity.getCost());
				dto.setId(entity.getId());
				listofDTO.add(dto);
				
			}
			System.out.println("size of dtos"+listofDTO.size());
			System.out.println("size of entities"+listofDTO.size());
			return listofDTO;
		}else {
			System.out.println("company is invalid...");
		}
		
		return ToyService.super.findByCompany(Company);
		
	}
public Set<ConstraintViolation<ToyDto>> validateAndUpdate(ToyDto dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<ToyDto>> violations = validator.validate(dto);
		
		if(violations !=null && !violations.isEmpty()) {
			System.out.println("Violations in dto "+dto);
			return violations;
		}else {
			System.out.println("Violations is not there in dto can save");
			
			ToyEntity entity = new ToyEntity();
			entity.setId(dto.getId());
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setColor(dto.getColor());
			 
			boolean saved = this.toysRepository.update(entity);
			System.out.println("Entity Data is saved "+saved);
			return Collections.emptySet(); 
		}
	}

	
}

