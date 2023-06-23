package LinkedLists;
import java.util.Scanner;
import asignment.Node;
public class p6 
{
		static Node head=null;
		static Node temp=null;
		static int count=0;
		static Scanner s=new Scanner(System.in);
		public static void main(String[] args) {
		int choice;
		do 
		{
			System.out.println("select an option");
			System.out.println("1.creation\n2.traversing\n3.insertion\n4.exit");
			System.out.println("enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:creation();
				break;
				case 2:System.out.println("first create the linked list");
					traversing();
				break;
				case 4:System.exit(0);
				break;
				default:System.out.println("invalid!!");
				break;
			}
			
		 }
		 while(choice!=0);
		}
	public static void creation()
	{
		Scanner s=new Scanner(System.in);
		head=null;
		temp=null;
		int ch=1;
		while(ch==1)
		{
			Node sn=new Node();
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
			temp=temp.next;
			count++;
		}
	}
}
