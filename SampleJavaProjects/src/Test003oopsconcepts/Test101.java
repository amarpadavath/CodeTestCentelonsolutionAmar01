package Test003oopsconcepts;

public class Test101 {
	
	
		 static String employee_name;
		 static double employee_salary;
		 
		 static void set(String n, double d)
		 {
			 employee_name = n;
			 employee_salary = d ;
			 
		 }
		 
		 static void get()
		 {
			 System.out.println(" employee name" +employee_name);
			 System.out.println(" employee name" +employee_salary);
		 }
		 
		 public static void main(String args[])
		 {
			 Test101 obj = new Test101();
			 Test101.set("fgfgcvbcvb", 1000.05);
			 Test101.get();
		 }
	

}
