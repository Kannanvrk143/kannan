package week1.day3;

public class MobilePhone {
int ramsize;
long imeinumber;
boolean ischarge;
String brandname;
String modelname;
double mobileprice;
public static void main(String[] args) {
	MobilePhone mop=new MobilePhone();
	mop.ramsize=8;
	mop.imeinumber=10;
	System.out.println(mop.ramsize);
	System.out.println("imeinumber is: "+mop.imeinumber);
	System.out.println(mop.ischarge);
	System.out.println(mop.brandname);
	System.out.println(mop.modelname);
	System.out.println(mop.mobileprice);
}


}
