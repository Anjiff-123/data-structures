package asignment;
import java.util.Scanner;
public class pgm28 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	int a=s.nextInt();
	System.out.println("enter b:");
	int b=s.nextInt();
	int sum=0,sum1=0;
	for(int i=a;i>0;i=i/10)
	{
		int rem=i%10;
		sum=10*sum+rem;
	}
	for(int i=b;i>0;i=i/10)
	{
		int rem=i%10;
		sum1=sum1+rem;
	}
	System.out.println(sum);
	System.out.println(sum1);
}
}
