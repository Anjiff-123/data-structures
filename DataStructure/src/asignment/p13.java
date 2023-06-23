package asignment;
import java.util.*;
public class p13 {
		public static void main(String[] args)
		{
			TreeSet t=new TreeSet();
			t.add(10);
			t.add(2);
			t.add(34);
			t.add(34);
			System.out.println(t);
			Iterator i=t.descendingIterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
}
