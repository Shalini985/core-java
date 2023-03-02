package com.xworkz.toy.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name = "toy")
@NamedQuery(name="findCompany",query  ="select ent from ToyEntity ent where ent.company=:comp")

public class ToyEntity {

	@Id
	@Column(name = "t_id")
	private int id;
	
	@Column(name = "t_company")
	private String company;
	
	@Column(name = "t_name")
	private String name;
	
	@Column(name = "t_cost")
	private Double cost;
	
	@Column(name = "t_type")
	private String type;
	
	@Column(name = "t_color")
	private String color;
}



