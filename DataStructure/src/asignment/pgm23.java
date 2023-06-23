package asignment;
import java.util.Scanner;
public class pgm23 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("enter string:");
	String s1=s.nextLine();
	String s2="";
	for(int i=0;i<s1.length();i++)
	{
		char ch[]=s1.toCharArray();
		for(int j=0;j<2;j++)
		{
			s2=s2+ch[i];
		}
	}
	System.out.println(s2);
	
}
}
