package Test009com.conitional.statements;

import java.util.Scanner;

public class Test102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		
		float w = scn.nextFloat();
		
	//	int a =25;
	//	double w = 65.5;
		
		if(a>=18)
		{
			
			if(w>=50)
			{
				System.out.println("eligible to donate");
			}
			
			else
			{
				System.out.println("no eligible to donate");
			}
		}
		else
		{
			System.out.println("minor");
		}

	}

}
