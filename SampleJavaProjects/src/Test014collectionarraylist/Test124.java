package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test124
{

public static void main(String arg[])

{

List<String> s = new ArrayList<>();

s.add("amar1");
s.add("amar2");
s.add("amar3");

for(int i=0;i<s.size();i++)
{
System.out.print(s.get(i)+" ");
}

System.out.println();

for(String w : s)

{
System.out.print(w+" ");
}


}


}