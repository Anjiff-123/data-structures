package asignment;
import java.util.Scanner;
public class a3 {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter string:");
	String str=s.next();
	int count=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if( ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			count++;
		}
	}
	System.out.println("no of vowels in the string:"+count);
}//4th program
}
