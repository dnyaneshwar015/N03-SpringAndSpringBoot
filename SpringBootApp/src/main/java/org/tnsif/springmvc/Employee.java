package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
//private data member
private int empid;
private String empname;


//getter and setter method
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}

public void print() {
	System.out.println("Employee are belongs to IT Department ");
	System.out.println("Employee ID: "+empid+" "+"Employee name: "+empname);
}


}
