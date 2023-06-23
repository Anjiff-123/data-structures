package asignment;
import java.util.*;
public class p2
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		PriorityQueue p=new PriorityQueue();
		p.add(10);
		p.add(3);
		p.offer(1);
		p.offer(12);
		System.out.println(p);
		p.poll();
		System.out.println(p);
		p.poll();
		System.out.println(p);
		System.out.println(p.peek());
		
	}
}