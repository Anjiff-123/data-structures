package asignment;
import java.util.Scanner;
public class ass1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter the size:");
		int size=s.nextInt();
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the target:");
		int t=s.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(t==a[i]+a[j])
					System.out.println("pair found"+a[i]+","+a[j] );
			}
		}
	}
}
