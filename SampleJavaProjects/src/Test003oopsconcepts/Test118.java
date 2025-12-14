package Test003oopsconcepts;

public class Test118 {
	
	String n = "Geeksfor geeks";
	
	public static void main(String arg[])
	
	{
		try {
			  Class<?> c = Class.forName("Geeks");
			 
			  Test118 o = (Test118) c.getDeclaredConstructor().newInstance();
			  
			  System.out.println(o.n);
	          
			  catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        }
		        catch (InstantiationException e) {
		            e.printStackTrace();
		        }
		        catch (IllegalAccessException e) {
		            e.printStackTrace();
		        }
		        catch (NoSuchMethodException e) {
		            e.printStackTrace();
		        }
		        catch (Exception e) {
		            e.printStackTrace();
		        }
	

}
