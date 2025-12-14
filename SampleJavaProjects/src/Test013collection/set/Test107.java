package Test013collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test107
{
public static void main(String args[])
{
Set<String>  h = new LinkedHashSet<String>();

h.add("india");
h.add("Australia");
h.add("south africa");
h.add("new zeeland");

h.add("india");

System.out.println(h);

h.remove("Australia");

System.out.println(" set after removing aus"+h);

Iterator<String> d= h.iterator();

while(d.hasNext())
{
System.out.println(d.next());
}

Set<String> x = new TreeSet<String>();

x.add("amar");
x.add("ama1");
x.add("amar1");
x.add("amar2");
x.add("amar3");

System.out.print(x);

x.remove("amar");

System.out.print(x);

Iterator<String> l = x.iterator();

while(l.hasNext())
{
	System.out.println(l.next());
}
}
}
