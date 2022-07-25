package week1.day2;

public class Car {
public void cardrive() {
System.out.println("welcome to drive");
}
public void carparking() {
	System.out.println("parking");
}
public void carfast() {
	System.out.println("going fast");
}
public void carslow() {
	System.out.println("going slow");
}
public static void main(String[] args) {
	Car car=new Car();
	car.cardrive();
	car.carparking();
	car.carfast();
	car.carslow();
	
}
}