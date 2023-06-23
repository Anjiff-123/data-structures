package asignment;
import java.util.*;
public class p11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		s.add(10);
		s.push(20);
		s.push(30);
		s.push("hello");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		
		/*Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		*/while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
		System.out.println(s);
	}
}