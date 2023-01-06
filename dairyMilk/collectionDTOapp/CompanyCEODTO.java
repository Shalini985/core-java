package com.xwork.collectionDTOapp;





	import java.io.Serializable;
	
	
public class CompanyCEODTO  implements Serializable{
		private String name;
		private String developedBy;
		private Type type;
		private double size;
		private double licenceCost;
		public CompanyCEODTO() {
			// TODO Auto-generated constructor stub
		}
		public CompanyCEODTO(String name, String developedBy, Type type, double size, double licenceCost) {
			super();
			this.name = name;
			this.developedBy = developedBy;
			this.type = type;
			this.size = size;
			this.licenceCost = licenceCost;
		}
		
		public CompanyCEODTO(String string, String string2, int i, String string3, String string4, boolean b) {
			// TODO Auto-generated constructor stub
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 30;
			
		}
		@Override
		public boolean equals(Object obj) {
			if (obj != null) {
				if (obj instanceof CompanyCEODTO) {
					CompanyCEODTO dataBaseVenderDTO = (CompanyCEODTO) obj;
					if (dataBaseVenderDTO.getName().equals(this.name)
							&& dataBaseVenderDTO.getDevelopedBy().equals(this.developedBy)
							) {

						System.out.println("Cheacking Sucessfully ");
						return true;
					}

				}
			}
			return false;
		}
		
		@Override
		public String toString() {
			return "DataBaseVenderDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
					+ ", licenceCost=" + licenceCost + "]";
		}
		public String getName() {
			return name;
		}
		public String getDevelopedBy() {
			return developedBy;
		}
		public Type getType() {
			return type;
		}
		public double getSize() {
			return size;
		}
		public double getLicenceCost() {
			return licenceCost;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDevelopedBy(String developedBy) {
			this.developedBy = developedBy;
		}
		public void setType(Type type) {
			this.type = type;
		}
		public void setSize(double size) {
			this.size = size;
		}
		public void setLicenceCost(double licenceCost) {
			this.licenceCost = licenceCost;
		}
		public int getAges() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		
		
		

	


}
