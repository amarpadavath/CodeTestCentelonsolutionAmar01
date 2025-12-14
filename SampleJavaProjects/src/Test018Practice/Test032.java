package Test018Practice;

public class Test032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "am s dc dd";
		
		int count =0;
		
		int other=0;
		
		String f  = s.replaceAll(" ","");
		
		System.out.println(f);
		
		for(int i=0;i<f.length();i++)
		{
			
			if(f.charAt(i)=='a')
				
				{
					count++;
					
				}
				
				else{
					
					other++;
					
				}
			
		}
		
		System.out.println(count);
		System.out.println(other);

	}

}
