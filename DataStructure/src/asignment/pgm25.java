package asignment;
import java.util.Scanner;
public class pgm25 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	int a=s.nextInt();
	System.out.println("enter b:");
	int b=s.nextInt();
	System.out.println(teen(a,b));
	}
	public static int teen(int a,int b) {
	if(a<13||b<13||a>19||b>19)
	{
		return (a+b);
	}
	if((a>=13&&a<=19)||(b>=13&&b<=19))
	{
		return 19;
	}
	
	}
}
