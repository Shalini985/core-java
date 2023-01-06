package com.xwork.collectionDTOapp;

import java.util.Objects;

public class MovieDTO {
	private String name;
	private int budget;
	private String langName;
	
    public MovieDTO(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(budget, langName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDTO other = (MovieDTO) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(langName, other.langName)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", budget=" + budget + ", langName=" + langName + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getLangName() {
		return langName;
	}

	public void setLangName(String langName) {
		this.langName = langName;
	}
    
}
