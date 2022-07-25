package week2.day1;

public class EmployeeDetails {
	public void printidno(int idno) {
		System.out.println(idno);
	}
public void printName(String Name) {
	System.out.println(Name);
}
public void printcondactno(String condactno) {
	System.out.println(condactno);
}
public void printAddress(String Address) {
	System.out.println(Address);
}
public void printjoiningdate(String joiningdate) {
	System.out.println(joiningdate);
}
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	emp.printidno(4567);
	emp.printName("kannan");
	emp.printcondactno("735852");
	emp.printAddress("salem");
	emp.printjoiningdate("4/5/2020");
	
}
}