package com.xworkz.toy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ToyDto {
	@Id
	private int id;
	
	@Size(min = 3 , max = 20 , message = "Comapany should be grester than 3 and less than 20")
	private String company;
	
	@Size(min = 3 , max = 20 , message = "name should be grester than 3 and less than 20")
	private String name;
	 
	@NotNull(message = "cost should not be null")
	private Double cost;
	
	@NotBlank(message = "type should not be null")
	private String type;
	
	@NotBlank(message = "color should not be null")
	private String color;
} 
