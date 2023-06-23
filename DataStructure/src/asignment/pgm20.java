package asignment;
import java.util.Scanner;
public class pgm20 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("enter String:");
	String s1=s.next();
	String s2="";
	char ch[]=s1.toCharArray();
	for(int i=0;i<2;i++)
	{
		
		s2=s2+ch[i];
	}
	System.out.println(s2+s1+s2);
}
}
