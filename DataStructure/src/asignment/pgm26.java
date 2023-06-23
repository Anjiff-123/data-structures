package asignment;
import java.util.Scanner;
public class pgm26 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	int a=s.nextInt();
	System.out.println("enter b:");
	int b=s.nextInt();
	System.out.println("enter c:");
	int c=s.nextInt();
	if(a==b&&a==c)
	{
		System.out.println(20);
	}
	else if(a==b||b==c)
		System.out.println(10);
	else
		System.out.println(0);
	
	}
}
