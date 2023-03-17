package org.tnsif.objectsInjection;

public class CellPhone {
Charger c;
Sim s;
public void setC(Charger c) {
	this.c = c;
}
public void setS(Sim s) {
	this.s = s;
}
@Override
public String toString() {
	return "CellPhone [c=" + c + ", s=" + s + "]";
}


}
