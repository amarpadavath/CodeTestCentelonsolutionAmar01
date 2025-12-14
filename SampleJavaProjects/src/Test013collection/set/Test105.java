package Test013collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test105

{

public static void main(String args[])
{

Set<String> s = new HashSet<String>();

s.add("amar1");
s.add("amar1");
s.add("amar2");
s.add("amar3");
s.add("amar4");
s.add("amar5");
s.add("amar6");

System.out.println(s);

s.remove("amar4");
s.remove("amar5");

Iterator<String> h = s.iterator();

while(h.hasNext())
{
 System.out.println(h.next());
}


}
}
