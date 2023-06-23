package asignment;
import java.util.Scanner;
public class space {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter string:");
	String s1=s.nextLine();
	int c1=0;
	char c[]=s1.toCharArray();
	String s3=" ";
	for(int i=0;i<c.length;i++)
	{
		if(i<c.length&&c[i]==' ')
			c1++;
	}
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==' '&&c[i-1]!=' ')
		{
			for(int j=0;j<i;j++)
			{
				s3=s3+c[i];
			}
			s3=s3+' ';
		}
	}
	System.out.println(s3);
	
}
}
