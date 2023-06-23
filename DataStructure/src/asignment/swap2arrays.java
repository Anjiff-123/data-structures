package asignment;
public class swap2arrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int b[]= {3,4,3,2};
	int c[]= new int[b.length];
	for(int i=0;i<b.length;i++)
	{
		c[i]=b[i];
	}
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		a[i]=c[i];
	}
	System.out.println("a:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	System.out.println();
	System.out.println("b:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(b[i]);
	}
	
}
}
