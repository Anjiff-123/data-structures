package asignment;
import java.util.*;
import java.util.TreeMap;
import java.util.ListIterator;
import java.util.Map.Entry;
public class p25{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		TreeMap t=new TreeMap();
		t.put(1,34);
		t.put(2, 33);
		t.put(3, 35);
		t.put(5,"hello");
		t.put(4, 35);
		t.put(6,"hello");
		System.out.println(t);
		Set s1=t.keySet();
		for(Object o:s1) {
			System.out.println(o);
		}
		Collection s2=t.values();
		for(Object o:s2) {
			System.out.println(o);
		}
		
		
	}
}

