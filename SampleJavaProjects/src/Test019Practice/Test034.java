package Test019Practice;



	 enum Level
		{
			
			LOW("it is low"),
			MEDIUM("It is medium"),
			HIGH("It is high");
			
			public String description;
			
			private Level(String description)
			{
				this.description = description;
			
			}
			
			public String getDescription()
			{
			    return description;   // ✅ Correct: returns the instance variable, not the method
			}
			
			
			
			
		}
		
		public class Test034
		{
			public static void main(String args[])
			{
				Level myVar = Level.MEDIUM;
				
				System.out.println(myVar.getDescription());
			}
		}

