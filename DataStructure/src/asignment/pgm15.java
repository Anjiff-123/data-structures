package asignment;
import java.util.Scanner;
public class pgm15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a:");
		int a=s.nextInt();
		if(a>=1&&a<=100)
		{
			if(a%5==0&&a%3==0)
			{
				System.out.println("Fizz"+"Buzz"+'!');
			}
			else if(a%3==0)
			{
				System.out.println("Fizz"+'!');
			}
			else if(a%5==0)
			{
				System.out.println("Buzz"+'!');
			}
			else if(a%5!=0||a%3!=0)
				System.out.println(a+"!");
		}
		else
			System.out.println();
	}
			
}
