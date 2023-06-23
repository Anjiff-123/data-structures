package asignment;
import java.util.Scanner;
public class pgm7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		int sum=0,product=1;
		for(int i=m;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+rem;
			product=product*rem;
		}
		sum=sum+product;
		if(m==sum)
			System.out.println("its a special number");
		else
			System.out.println("its not a special number");
	}
}
