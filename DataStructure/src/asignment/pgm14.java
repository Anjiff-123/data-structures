package asignment;
import java.util.Scanner;
public class pgm14 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("enter size:");
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		int lb=a[0];
		int ub=a[size-1];
		int mid=(lb+ub)/2;
		System.out.println(counting(a,lb,mid,ub));
	}
		public static boolean counting(int a[],int lb,int mid,int ub)
		{
		int count=0;
		int j=0;
		for(int i=0;i<=ub;i=i+2)
		{
			if(a[j]==a[i]||a[j]==a[i+1])
				count++;
		}
		if(count==mid)
			return true;
		else
			return false;
		}
			
		
}
