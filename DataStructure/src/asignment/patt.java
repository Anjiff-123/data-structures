package asignment;

public class patt {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(i>=j||i+j>8)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
