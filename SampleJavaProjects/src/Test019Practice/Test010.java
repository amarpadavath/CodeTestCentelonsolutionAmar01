package Test019Practice;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		
		System.out.println("xfvcxv");
		for (int i = 0; i < 6; i++) {
			  if (i == 2) {
			    continue;
			  }
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			 
			 
			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for(int i =0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}

	}

}
