package Test018Practice;

public class Test037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3};
		
		int arr2[] = {1,2,3};
		
		boolean equal=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					equal=false;
				}
			}
		}
		else
		{
			equal=false;
		}
		
		if(equal)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("no");
		}

	}

}
