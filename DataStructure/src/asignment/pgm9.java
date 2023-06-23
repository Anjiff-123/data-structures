package asignment;
import java.util.Scanner;
public class pgm9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		if(m%10==7||m%7==0)
		{
			System.out.println("its a buzz number");
		}
		else
			System.out.println("its not a buzz number");
	
	}
}
