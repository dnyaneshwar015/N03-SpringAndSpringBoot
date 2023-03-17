package org.tnsif.literals;

public class SwiftEngine implements IEngine{
	
	//1.DI in the form of literals
	private String company;
	private double cost;
	
	public double cost() {
		return cost;
	}
	public String display() {
		return "Korea";
	}
	
	//DI 
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	
	
	//DI using getter and setter method
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//to string method use
	@Override
	public String toString() {
		return "Origin of company: "+company+" "+fuel;
	}
	
	
}
