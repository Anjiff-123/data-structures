
package asignment;
import java.util.Scanner;
public class swapstring {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter s1:");
	String s1=s.nextLine();
	System.out.println("enter s2:");
	String s2=s.nextLine();
	char c1[]=new char[100];
	char c2[]=new char[100];
	for(int i=0;i<c1.length;i++)
	{
		c1[i]=s1.charAt(i);
	}
	for(int i=0;i<c1.length;i++)
	{
		c2[i]=s2.charAt(i);
	}
	int j=0;
	for(int i=50;i<c2.length;i++)
	{
		
		c2[i]=c1[j];
		j++;
	}
	int k=50;
	for(int i=0;i<50;i++)
	{
		c2[i]=c2[k];
	}
	for(int i=0;i<c1.length;i++)
	{
		System.out.print(c1[i]);
	}
	for(int i=0;i<50;i++)
	{
		System.out.print(c2[i]);
	}
	}
}