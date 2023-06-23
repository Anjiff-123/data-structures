package asignment;

public class asc3 {
public static void main(String[] args) {
	int a[]= {4,5,2,25};
	for(int i=0;i<3;i++)
	{
		int g=0;
		for(int j=i+1;j<4;j++)
		{
			if(a[i]<a[j])
			{
				g=j;
				break;
			}
			
		}System.out.println(a[i]+"---- "+a[g]);
	}System.out.println(a[3]+"----- "+-1);
}	
}
