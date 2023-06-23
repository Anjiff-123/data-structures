package asignment;
import java.util.Scanner;
public class pgm10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String:");
		String s1=s.next();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
				ch=(char)(ch+32);
			s2=s2+(ch);
		}
		System.out.println(s2);
	}
}
