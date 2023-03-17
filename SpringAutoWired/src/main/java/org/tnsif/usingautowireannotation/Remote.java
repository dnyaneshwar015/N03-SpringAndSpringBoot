package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {

	private Cell cell;

	
	@Autowired
	/*when you have created multiple bean then if you want to access
	particular one then use @Qaulifier annotation
	*/
	@Qualifier("c2")
	//DI Using setters
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	//default constructor
	public Remote() {
	System.out.println("Default constructor for remote");
	}
	
	//injecting the object of cell class
	public void remote() {
		cell.power();
	}
	
	
}
