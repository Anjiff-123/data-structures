package asignment;
import java.util.Scanner;
public class practice 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2="";
		char a[]=s1.toCharArray();
		char a1[]=new char[100];
		boolean b[]=new boolean[100];
		for(int i=0;i<a.length+1;i++)
		{
			int count=0;
			if(b[i]==false)
			{
				for(int j=0;j<a.length+1;j++)
				{
					if(a[i]==a[j+1])
					{
						count++;
						b[j+1]=true;
					}
				}
				int count1=0;
				for(int x=1;x<=count;x++)
				{
					if(count%x==0)
					{
						count1++;
					}
				}
				if(count1==2)
				{
					for(int y=0;y<a.length;y++)
					{
						a1[y]=a[y];
					}
				}
			}
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
	}

}
