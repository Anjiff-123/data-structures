package asignment;
import java.util.Scanner;
public class ass2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter the size:");
		int size=s.nextInt();
		int b[]=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		int j=0,l=size-1;
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
				b[j]=a[i];
				j++;
			}
			else
			{	b[l]=0;
				l--;
			}
		}
		for(int i=0;i<size;i++)
		{
			a[i]=b[i];
			System.out.println(a[i]);
		}
	}

}
