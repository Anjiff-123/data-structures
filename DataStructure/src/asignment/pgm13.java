package asignment;
import java.util.Scanner;
public class pgm13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a:");
		int a=s.nextInt();
		System.out.println("enter b:");
		int b=s.nextInt();
		System.out.println("enter c:");
		int c=s.nextInt();
		if(a==13)
		{
			a=0;
			b=0;
			c=0;
			System.out.println(a+b+c);
		}
		else if(b==13)
		{
			b=0;
			c=0;
			System.out.println(a+b+c);
		}
		else if(c==13)
		{
			System.out.println(a+b);
		}
		else
			System.out.println(a+b+c);
	}

}
