package org.tnsif.autowiredexample;

public class Farmer {
//DI in the form of object
	Farm f;
	
	//DI using setters
	/*public void setF(Farm f) {
		this.f = f;
	}*/
	
//injection the object of farm
	public void accept()
	{
		f.engine();
	}
	
	
	//DI Using constructor
	public Farmer(Farm f) {
		super();
		System.out.println("Autowiring using constructor");
		this.f=f;
	}
	
	
	
}
