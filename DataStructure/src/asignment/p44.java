package asignment;
import java.util.*;
import java.util.Map.Entry;
public class p44{
	public static void main(String[] args) {
	LinkedHashMap l=new LinkedHashMap();
	l.put(3, 34);
	l.put(1, 2);
	l.put(2, 2);
	l.put(3, 3);
	l.put(4,"sizzlerr");
	System.out.println(l);
	Set s1=l.keySet();
	for(Object o:s1) {
		System.out.println(o);
	}System.out.println();
	Collection s2=l.values();
	for(Object o:s2) {
		System.out.println(o);
	}
}
	
	
}


