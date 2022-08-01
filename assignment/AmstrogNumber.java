package assigement;

public class AmstrogNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=143;
		int sum=0;int remainder;int temp;
		temp=number;
		while(number>0) {
			remainder=number%10;
			sum=sum+(remainder*remainder*remainder);
			number=number/10;
		
		}
		if(temp==sum) {
			System.out.println("Amstrongnumber");
		}
		else {
			System.out.println("not Amstrong number");
	
			
		}
	}

}
