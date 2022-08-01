package assigement;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {

		//Converting odd index of a given string to UpperCase

		String test = "kannan";

		char[] charArray = test.toCharArray();

		String convertedStr="";

		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				convertedStr=convertedStr+Character.toUpperCase(charArray[i]);
			}
			else {
				convertedStr=convertedStr+charArray[i];

			}
		}



		System.out.println(convertedStr);
	}

}

