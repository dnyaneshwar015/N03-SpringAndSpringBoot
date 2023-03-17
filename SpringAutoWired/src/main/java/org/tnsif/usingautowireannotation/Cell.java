package org.tnsif.usingautowireannotation;

public class Cell {
	//private data member
	private String company;
	private String size;
	
	
	//using setters
	public void setCompany(String company) {
		this.company = company;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//default constructor
	public Cell() {
		super();
		System.out.println("Default constructor for cell");
	}
	
	public void power(){
		System.out.println("Company of a cell: "+company);
		System.out.println("Size of a cell: "+size);
	}
	
}
