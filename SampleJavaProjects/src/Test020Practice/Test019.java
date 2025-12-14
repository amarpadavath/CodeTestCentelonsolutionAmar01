package Test020Practice;

public class Test019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOne = {2,5,1,7,4};
		int[] arrayTwo = {2,5,1,7,8};
		
		boolean trueOrFalse=true;
		
		if(arrayOne.length==arrayTwo.length)
		{
			for(int i=0;i<=arrayOne.length-1;i++)
			{
				if(arrayOne[i]!=arrayTwo[i])
				{
					trueOrFalse=false;
					
					break;
					
					
				}
				
			
			}
		}
		else
		{
			trueOrFalse=true;
		}
		
		if(trueOrFalse==true)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
