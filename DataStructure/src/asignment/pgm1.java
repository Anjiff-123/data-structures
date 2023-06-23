package asignment;
import java.util.Scanner;
public class pgm1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		System.out.println("enter n:");
		int n=s.nextInt();
		System.out.println(add(m,n));
	}
	public static int add(int m,int n) {
		if(m!=n)
		{
			return m+n;
		}
		else
		{
			return 2*(m+n);
		}
	}
}
