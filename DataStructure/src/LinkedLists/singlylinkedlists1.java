package LinkedLists;
import java.util.Scanner;
public class singlylinkedlists1
{
	static StructNode head;
	static StructNode temp;
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int choice;
		do 
		{
			System.out.println("select an option");
			System.out.println("1.creation\n2.traversing\n3.exit");
			System.out.println("enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:creation();
				break;
				case 2:System.out.println("first create the linked list");
					traversing();
				break;
				case 4:inserting();
				break;
				case 3:System.exit(0);
				break;
				default:System.out.println("invalid!!");
				break;
			}
			
		 }
		 while(choice!=0);)
	}
	public static void creation()
	{
		Scanner s=new Scanner(System.in);
		head=null;
		temp=null;
		int ch=1;
		while(ch==1)
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
				temp=sn;
			}
			System.out.println("do you want to create node(1/0)");
			ch=s.nextInt();
		}
	}
	public static void traversing()
	{
		temp=head;
		System.out.println("entered elements are:");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;;
		}
	}
	public static void inserting()
	{
		Scanner s=new Scanner(System.in);
		StructNode sn=new StructNode();
		System.out.println("enter data:");
		sn.data=s.nextInt();
		sn.next=null;
		sn.next=head;
		head=sn;
	}
}
	

	
