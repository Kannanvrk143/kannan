package assigement;

public class PrintingDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,4,6,7,8,9,8,7,6,0,1,3,};
		//Printing Duplicate numbers present in an array.
		System.out.println("Duplicate Numbers are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+",");
				}
			}
		}
	}
}
