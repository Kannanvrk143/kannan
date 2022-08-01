package assigement;

import java.util.Arrays;

public class Below {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="below";
		String text2="woleb";
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);
			System.out.println("Do both the arrays match:"+Arrays.equals(charArray1, charArray2));
		}
	}
}