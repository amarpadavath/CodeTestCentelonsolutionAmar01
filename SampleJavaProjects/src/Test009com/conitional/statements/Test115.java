package Test009com.conitional.statements;

public class Test115 {
	
	public static void main(String args[])
	{
		boolean t = true;
		
		first:{
			second:{
				third:{
					
					System.out.println("brofre break");;
					
					if(t)
					{
						break second;
					}
					System.out.println("this will not execute");
					
				}
				System.out.println("this will not");
				}
			System.out.println("tgis will not");
			}
		
		}
		
	}


