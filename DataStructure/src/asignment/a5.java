package asignment;
import java.util.Scanner;
public class a5 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		System.out.println("enter n:");
		int n=s.nextInt();
		System.out.println(com(m,n));

	}
	public static boolean com(int m,int n)
	{
		int a=m/10,b=n/10;
		if(m>25&&n<75)
		{
			if(m%10==n%10||a%10==b%10||m%10==a%10||n%10==b%10)
				return true;
			else 
				return false;
			
		}
	}

}
