package asignment;
import java.util.Scanner;
public class pgm6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter m:");
		int m=s.nextInt();
		int count=0;
		for(int i=m;i>0;i=i/10)
		{
			int rem=i%10;
			if(rem==0)
			{
				count++;
			}
		}
		if(count!=0)
			System.out.println("its a duck number");
		else
			System.out.println("its not a duck nmuber");
	}
}
