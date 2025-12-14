package Test002String2;

public class Test019Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex = "cat|dog|fish";
		
		System.out.println("cat".matches(regex));
		System.out.println("dog".matches(regex));
		System.out.println("catfish".matches(regex));
		System.out.println("doggy bag".matches(regex));
		


	}

}
