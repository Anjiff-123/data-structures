package asignment;
import java.util.*;
public class p14 {
	public static void main(String[] args)
	{
		LinkedHashSet t=new LinkedHashSet();
		t.add(10);
		t.add(2);
		t.add(34);
		System.out.println(t);
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
