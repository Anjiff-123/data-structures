package asignment;
import java.util.Scanner;
public class pgm8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		int sum=0;
		for(int i=m;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+rem;
		}
		if(m%sum==0)
			System.out.println("its a harshad number");
		else
			System.out.println("its not a harshad number");
	}
}
