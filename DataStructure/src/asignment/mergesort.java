package asignment;
import java.util.Scanner;
public class mergesort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter size:");
		int size=s.nextInt();
		System.out.println("enter elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		int lb=0;
		int ub=size-1;
		mergesort(a,lb,ub);
	}
	public static void mergesort(int a[],int lb,int ub)
	{
		if(lb<ub)
		{	
			int mid=(lb+ub)/2;
			mergesort(a, lb, mid);
			mergesort(a, mid+1, ub);
			merge(a,lb,mid,ub);
		}
	}
	public static void merge(int a[],int lb,int mid,int ub)
	{
		int i=lb;
		int j=mid+1;
		int b[]=new int[100];
		int k=0;
		while(i<=mid&&j<=ub)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				i++;
			}
			else
			{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		while(j<=ub)
		{
			b[k]=a[j];
			j++;
			k++;
		}
		while(i<=mid)
		{
			b[k]=a[i];
			i++;
			k++;
		}
		for(int m=0,n=lb;m<b.length;m++,n++)
		{
			a[n]=b[m];
			System.out.println(a[n]);
		}
	}
		
}
