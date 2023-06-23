package asignment;
import java.util.Scanner;
public class reverseofwordsinasentence {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string1:");
		String s1=s.nextLine();
		char c[]=s1.toCharArray();
		String out="";
		for(int i=c.length-1;i>=0;i--)
		{
			int j=i;
			while(i>=0&&c[i]!=' ')
			{
				i--;
			}
			int k=i+1;
			while(k<=j)
			{
				out=out+c[k];
				k++;
			}
			if(i>=0)
			{
				out=out+c[i];
			}
		}
		System.out.println(out);
	}
}
