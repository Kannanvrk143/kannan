package college;

public class Student extends Department{
		public void studentName() 
		{
		System.out.println("kannan");
		}
		public void studentdept() 
		{
		 	System.out.println("ECE");
		}
		public void studentid() {
			System.out.println("16EC121");
		}
		public static void main(String[] args) {
		Student std =new Student();
		std.studentdept();
		std.studentid();
		std.studentName();
		std.collegeName();
		std.collegecode();
		std.collegerank();
		std.departmentname();

	}
	}


