package parking_lot_system;

public abstract class Vehicle {
private String type;
private String number;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public Vehicle(String type, String number) {
	
	this.type = type;
	this.number = number;
}
public abstract int getCharge();
}
