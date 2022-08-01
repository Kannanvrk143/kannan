package assigement;

public class FindingIntersection {
	public static void main(String[] args) {
		int a[]={1,2,3,1,8,9};
		int b[]= {1,2,8,4,9,7};
		System.out.println("Intersecting elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+",");
				}
			}
		}
	}
}


