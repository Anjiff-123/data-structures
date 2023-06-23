package asignment;
import java.util.Scanner;
public class Emp {
	String ename;
	double sal;
	int eid;
	static int count=0;
	

	public Emp(String ename,double sal,int eid) {
		// TODO Auto-generated constructor stub
		this.ename=ename;
		this.sal=sal;
		this.eid=eid;
		count++;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		Emp data[]=new Emp[size];
		for(int i=0;i<size;i++)
        {
            System.out.println("enter name:");
            String name=sc.nextLine();
            System.out.println("enter sal:");
            double d=s.nextDouble();
            System.out.println("enter eid:");
            int id=s.nextInt();
			data[i]=new Emp(name,d,id);
		}
		for(int i=0;i<count;i++)
		{
			System.out.println("ename:"+data[i].ename+" "+"sal:"+data[i].sal+" "+"eid:"+data[i].eid);
			
		}
		
	}

}
