package linkedlistspractice;
import java.util.Scanner;
public class merge2linkedlists 
{
	static StructNode head=null,head1=null;
	static StructNode temp=null,temp1=null;
	static StructNode prev=null;
	static Scanner s=new Scanner(System.in);
	static int ch=1,count=0;
	static int i=0;
	public static void main(String[] args) 
	{
		int choice=1;
		do
		{
				System.out.println("enter the option:");
				System.out.println("1.creation1\n2.traversing2\n3.creationl2\n4.traversingl2\n5.merge\n6.exit");
				choice=s.nextInt();
				switch(choice)
				{
					case 1:creationl1();
					break;
					case 2:traversingl1();
					break;
					case 3:creationl2();
					break;
					case 4:traversingl2();
					break;
					case 5:merge();
					break;
					case 6:System.exit(0);
					break;
				}
		}
		while(choice!=0);
	}
	public static void creationl1() {
		
		do
		{
			StructNode sn=new StructNode();
			System.out.println("enter data");
			sn.data=s.nextInt();
			sn.next=null;
			if(head==null)
			{
				head=temp=sn;
			}
			else
			{
				temp.next=sn;
				temp=temp.next;
			}
			System.out.println("do you want to create node(1/0)");
			ch=s.nextInt();
		}
		while(ch==1);
	}
	public static void traversingl1()
	{
		temp=head;
		while(temp!=null)
		{
			count++;
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
public static void creationl2() {
		
		do
		{
			StructNode sn=new StructNode();
			System.out.println("enter data");
			sn.data=s.nextInt();
			sn.next=null;
			if(head1==null)
			{
				head1=temp1=sn;
			}
			else
			{
				temp1.next=sn;
				temp1=temp1.next;
			}
			System.out.println("do you want to create node(1/0)");
			ch=s.nextInt();
		}
		while(ch==1);
	}
	public static void traversingl2()
	{
		temp1=head1;
		while(temp1!=null)
		{
			count++;
			System.out.println(temp1.data);
			temp1=temp1.next;
		}
	}
	public static void merge() {
		temp=head;
		temp1=head1;
		for(int i=0;i<count;i++)
		{
			if(i%2==0)
			{
				if(temp!=null)
				{
					System.out.println(temp.data);
					temp=temp.next;
				}
			}
			else
			{
				if(temp1!=null)
				{
					System.out.println(temp1.data);
					temp1=temp1.next;
				}	
			}
		}
	}
}