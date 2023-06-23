package asignment;
import java.util.Scanner;
public class ass3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter the a size:");
		int size1=s.nextInt();
		int b[]=new int[100];
		System.out.println("enter the b size:");
		int size2=s.nextInt();
		System.out.println("enter the a elements:");
		for(int i=0;i<size1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the b  elements:");
		for(int i=0;i<size2;i++)
		{
			b[i]=s.nextInt();
		}
		int r[]=new int[100];
		for(int i=0;i<Math.max(size1, size2);i++)
		{
			r[i]=a[i]+b[i];
			
		}
		System.out.println(" the r  elements:");
		for(int i=0;i<Math.max(size1, size2);i++)
		{
			System.out.println(r[i]);
		}
	}
	
	
}
