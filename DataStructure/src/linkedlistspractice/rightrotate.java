package linkedlistspractice;
import java.util.Scanner;
public class rightrotate {
	public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			int a[]=new int[100];
			System.out.println("enter size:");
			int size=s.nextInt();
			System.out.println("enter elements:");
			for(int i=0;i<size;i++)
			{
				a[i]=s.nextInt();
			}
			int b[]=new int[size];
			System.out.println("enter rotate pos:");
			int r=s.nextInt();
			int c=size-r;
			for(int i=0;i<r;i++)
			{
				b[i]=a[c];
				c++;
			}
			int j=0;
			for(int i=r;i<size;i++)
			{
				b[i]=a[j];
				j++;
			}
			for(int i=0;i<size;i++)
			{
				System.out.println(b[i]);
			}
		}
	

}
