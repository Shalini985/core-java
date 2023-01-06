package com.xwork.collectionDTOapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MovieTester {
	private static final String e1 = null;

	public static void main(String[] args) {
		
		Collection<MovieDTO> movie=new ArrayList<MovieDTO>();
		movie.add(new MovieDTO("KGf",100,"Kannada"));
		movie.add(new MovieDTO("RRR",200,"telugu"));
		movie.add(new MovieDTO("Avathr",100,"Engish"));
		
		
//movie.stream()
//.compator((e1.e2))->int e1 budget.compareto(e2,budget)
//.collect(collectors.toList()).
 //forEach(element->System.out.println(element));
		
	}
}