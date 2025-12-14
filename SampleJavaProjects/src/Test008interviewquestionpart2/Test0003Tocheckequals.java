package Test008interviewquestionpart2;

public class Test0003Tocheckequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 ={1,2,3};
		
		int[] arr2={1,2,3};
		
		boolean s = true;
		
		try
		{
		
		if(arr1.length==arr2.length)
		{
			for(int i =0;i<=arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					s= false;
				}
				
			}
			
		}
		
		else
		{
			s=false;
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		if(s)
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("not equals");
		}

	}

}
