package asignment;
import java.util.*;
public class clockmat {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in );
	int a[][]=new int[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	System.out.println();
	for(int i=0;i<3;i++)
	{
		for(int j=2;j>=0;j--)
		{
			System.out.print(a[j][i]);
		}
		System.out.println();
	}
}		
}
