package linkedlistspractice;
import java.util.Scanner;
public class distinctele 
{
	static StructNode head=null;
	static StructNode temp=null;
	static Scanner s=new Scanner(System.in);
	static int ch=1;
	static int a[]=new int[100];
	static int i=0;
	public static void main(String[] args) 
	{
		int choice=1;
		do
		{
				System.out.println("enter the option:");
				System.out.println("1.creation\n2.traversing\n3.condition\n4.exit");
				choice=s.nextInt();
				switch(choice)
				{
					case 1:creation();
					break;
					case 2:traversing();
					break;
					case 3:distinctcheck();
					break;
					case 4:System.exit(0);
					break;
				}
		}
		while(choice!=0);
	}
	public static void creation() {
		
		do
		{
			StructNode sn=new StructNode();
			System.out.println("enter data");
			sn.data=s.nextInt();
			a[i]=sn.data;
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
	public static void traversing()
	{
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void distinctcheck()
	{
		temp=head;
		StructNode temp1=temp.next;	
		while(temp!=null&&temp1!=null)
		{
			if(temp.data==temp1.data)
			{
				temp1.data=0;
			}
			temp=temp.next;
			temp1=temp1.next;
		}
		temp=head;
		while(temp!=null)
		{
			if(temp.data!=0)
			{
				System.out.println(temp.data);
			}
			temp=temp.next;
		}
	}
	
}

