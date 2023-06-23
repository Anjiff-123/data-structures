package asignment;
import java.util.Scanner;
public class mjmn {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the matrix:");
	int a[][]=new int [100][100];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]>a[i][j+1])
			{
				int temp=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=temp;
			}
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
}
}
