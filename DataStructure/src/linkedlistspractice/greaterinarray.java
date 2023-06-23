package linkedlistspractice;
import java.util.Scanner;
public class greaterinarray {
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
		
		for(int i=0;i<size;i++)
		{
			if(a[i]<a[i+1])
			{
				a[i]=0;
			}
		}
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
				System.out.println(a[i]);
		}
	}
}
