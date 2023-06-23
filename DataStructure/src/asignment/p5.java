package asignment;
import java.util.Scanner;
public class p5
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter the size:");
		int size=s.nextInt();
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(arraycount9(a,size));
	}
	public static boolean arraycount9(int a[],int size)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(a[i+1]==(a[i]+a[i+2])/2);
			{
				count++;
			}
		}
		if(count!=0)
			return true;
		else
			return false;
	}
}