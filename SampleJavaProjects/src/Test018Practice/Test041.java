package Test018Practice;

public class Test041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			int array[] = {1,5,6,8,4};
			
			int no = 6;
			
			for(int i=0;i<=array.length;i++)
				
				{
					
					for(int j=i+1;j<array.length;j++)
					{
					if(array[i]+array[j]==no)
					{
							System.out.println(array[i]+","+array[j]);
					}					
					}
					
					
				}
			
		}

	}


