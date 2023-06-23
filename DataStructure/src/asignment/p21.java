package asignment;

import java.util.*;
import java.util.Map.Entry;
public class p21 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	HashMap<Integer,String> h=new HashMap<>();
	h.put(1, "bharath");
	h.put(2, "ddd");
	h.put(3, "fff");
	System.out.println(h);
	Set s1=h.keySet();
	for(Object o:s1)
	{
		System.out.println(o);
	}
	Collection s2=h.values();
	for(Object o:s2)
	{
		System.out.println(o);
	}
	for(Entry i:h.entrySet())
	{
		System.out.println(i.getKey()+" "+i.getValue());
	}
	h.remove(2);
	System.out.println(h);
	System.out.println(h.containsValue("bharath"));
	System.out.println(h.get(1));
	
}
}
