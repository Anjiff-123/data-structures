package asignment;
import java.util.Scanner;
public class a2 {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter string:");
	String str=s.next();
	int count=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<=ch.length;i++)
	{
		count=i;
	}
	System.out.println("length of the string:"+count);
}
}
