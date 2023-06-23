package asignment;
import java.util.*;
public class p1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Vector v=new Vector<>();
		v.add(1);
		v.add(2.3);
		v.add("hello");
		ListIterator l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println();
		ListIterator l1=v.listIterator(v.size());
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
	}
}
