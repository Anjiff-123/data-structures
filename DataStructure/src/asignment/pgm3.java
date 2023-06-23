package asignment;
import java.util.Scanner;
public class pgm3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
	if(evenodd(m))
	System.out.println("even");
	else
	System.out.println("odd");
	}
	public static boolean evenodd(int m) {
		boolean evenodd=true;
		for(int i=1;i<=m;i++)
		{
			evenodd=!evenodd;
		}
		return evenodd;
	}
}
