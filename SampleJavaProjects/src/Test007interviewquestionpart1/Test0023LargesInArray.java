package Test007interviewquestionpart1;

public class Test0023LargesInArray {
	
	public static void main(String args[])
	{
		int arr[] = {20,30,40};
		
		int largest = arr[0];
		
		for(int num : arr)
		{
			if(num>largest)
			{
				largest = num;
			}
			
		}
		
		System.out.println(largest);
	}

}
