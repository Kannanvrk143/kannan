package assigement;

public class ConvertNegativeNumberToPositiveNumber {
	public static void main(String[] args) {
		int number=-99;
		if(number<0) {
			number=Math.abs(number);
			
		}
		System.out.println(number);
	}

}


