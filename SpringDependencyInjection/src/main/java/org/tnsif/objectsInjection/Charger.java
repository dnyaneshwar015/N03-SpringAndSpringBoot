package org.tnsif.objectsInjection;

public class Charger {
	
	private String brand;
	private int voltage;
	private String type;
	
	

	
	//DI using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", voltage=" + voltage + ", type=" + type + "]";
	}
}
