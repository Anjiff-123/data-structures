package asignment;
import java.util.Scanner;
public class a1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string:");
	String str=s.next();
	System.out.println("enter n:");
	int n=s.nextInt();
	String str2="";
	char ch[]=str.toCharArray();
	for(int j=0;j<n;j++)
	{
		str2=str2+ch[j];
	}
	for(int j=n;j<ch.length;j++)
	{
		str2=ch[j]+str2;
	}
	System.out.println(str2);
	}
}
