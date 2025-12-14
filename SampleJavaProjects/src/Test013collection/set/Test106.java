package Test013collection.set;

import java.util.EnumSet;
import java.util.Set;

enum Test1061 { CODE,LEARN,CONTRIBUTE,QUIZ,MCQ }

enum Test1062 { CODE,LEARN,CONTRIBUTE,QUIZ,MCQ }

public class Test106
{

public static void main(String args[])

{

Set<Test1061> set1;

set1 = EnumSet.of(Test1061.QUIZ,Test1061.CONTRIBUTE,
					Test1061.LEARN,Test1061.CODE);
					
					System.out.println("ser 1"+set1);

					
					
					Set<Test1062> set2 ;

					set2 = EnumSet.of(Test1062.CODE,Test1062.CONTRIBUTE);
					
					System.out.println("ser 1"+set2);
}



}