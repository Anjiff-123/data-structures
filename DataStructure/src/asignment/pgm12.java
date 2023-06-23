package asignment;
import java.util.Scanner;
public class pgm12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		System.out.println("enter n:");
		int n=s.nextInt();
		System.out.println(closeto21(m,n));
	}
	public static int closeto21(int m,int n) {
		if(m<=21&&n<=21)
		{
			if(21-m<21-n)
				return m;
			else
				return n;
				
		}
		else if(m<=21&&n>21)
		{
			return m;
		}
		else if(m>21&&n<=21)
		{
			return n;
		}
		else if(m>21&&n>21)
		{
			return 0;
		}
	}

}
		

