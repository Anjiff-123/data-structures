package asignment;
import java.util.*;
public class p15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(5);
		l.offer("hello");
		l.offer("hi");
		System.out.println(l);
		l.poll();
		System.out.println(l);
		
	}
}
