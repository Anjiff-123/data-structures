package asignment;

public class ascii {
public static void main(String[] args) {
	String s="QSPIDERS";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c.length-1-i;j++)
		{
			if(c[j]>c[j+1])
			{
				char temp=c[j];
				c[j]=c[j+1];
				c[j+1]=temp;
			}
		}
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]);
	}
}
}
