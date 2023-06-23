package asignment;
public class merge2arrays {
public static void main(String[] args) { 
	int c[]= {1,3,5,7,2,4,6,8};
	int t=0;
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c.length;j++)
		{
			if(c[j]>c[j+1])
			{
				t=c[j];
				c[j]=c[j+1];
				c[j+1]=c[j];
			}
		}
	}
	for(int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
}
