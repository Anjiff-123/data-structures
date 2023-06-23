package LinkedLists;
import java.util.Scanner;
public class sll1 {
	static StructNode head;
	static StructNode temp;
	static int count=0;
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args)
	{
		int choice;
		do
		{
			
				System.out.println("select any option:");
				System.out.println("1.creation\n2.traversing\n3.inserting at begin\n4.inserting at pos\n5.exit");
				choice=s.nextInt();
				switch(choice)
				{
					case 1:
						creation();
						break;
					case 2:
						traversing();
						break;
					case 3:
						inserting();
						break;
					case 4:
						insertingatpos();
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.println("invalid!!");
						break;
				}
		}
		while(choice!=0);
	}
	public static void creation()
	{
		int ch=1;
		while(ch==1)
		{
			StructNode sn=new StructNode();
			System.out.println("enter the data:");
			sn.data=s.nextInt();
			sn.next=null;
			if(head==null)
			{
				head=temp=sn;
			}
			else
			{
				temp.next=sn;
				temp=sn;
			}
			System.out.println("do you want to create node(1/0):");
			ch=s.nextInt();
		}
	}
	public static void traversing()
	{
		if(head==null)
		{
			System.out.println("first create node:");
		}
		else
		{
			temp=head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
				count++;
			}
		}
	}
	public static void inserting()
	{
		StructNode sn=new StructNode();
		System.out.println("enter data:");
		sn.data=s.nextInt();
		sn.next=null;
		sn.next=head;
		head=sn;
	}
	public static void insertingatpos()
	{
		System.out.println("enter p:");
		int p=s.nextInt();
		if(p>count||p<1)
		{
			System.out.println("invalid position");
		}
		else if(p==1)
		{
			inserting();
		}
		else
		{
			StructNode sn=new StructNode();
			System.out.println("enter data:");
			sn.data=s.nextInt();
			sn.next=null;
			temp=head;
			int i=1; 
			while(i<p-1)
			{
				temp=temp.next;
				i++;
			}
			sn.next=temp.next;
			temp.next=sn;
		}
		
	}		
}
