package com.xworkz.toy.repository;



import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.toy.dto.ToyDto;
import com.xworkz.toy.entity.ToyEntity;
public interface ToysRepository {

	boolean save (ToyEntity entity);
	
	default  ToyEntity findById(int id) {
	return null;
	}
	default List<ToyEntity> findByCompany(String company){
		return Collections.emptyList();
	}

	boolean update(ToyEntity entity);

	
	
	
}