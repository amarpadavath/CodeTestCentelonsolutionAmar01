
public class Test14Method2 {
	
	public static int i =0;
	 public Test14Method2() {
		// TODO Auto-generated constructor stub
		 
		 i++;
	}
	 
	 public static int get()
	 {
		 return i;
	 }
	 
	 public int m1()
	 {
		 System.out.println("inside method m1 bu object of other class");
		 this.m2();
		return 1;
	 }
	 
	 public void m2()
	 {
		 System.out.println(" method m2 came from m1");
	 }

}
