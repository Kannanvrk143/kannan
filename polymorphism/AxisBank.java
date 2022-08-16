package polymorphism;

public class AxisBank  extends BankInfo{
	public void deposit() {
	System.out.println("5000");
}public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.deposit();
	ab.fixed();
	ab.saving();
	
}

}



