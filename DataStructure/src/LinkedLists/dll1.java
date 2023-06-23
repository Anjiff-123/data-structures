package LinkedLists;

import java.security.PublicKey;
import java.util.Scanner;
class dll1 {
static StructNode head;
static StructNode temp;
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	int choice;
	do {
		System.out.println("select an option:");
		System.out.println("1.creation\n2.traversing\n3.insert at begin\n4.exit");
		
		choice=s.nextInt();
		switch(choice)
		{
			case 1:creating();
			break;
			case 2:traversing();
			break;
			case 3:insertatbeg();
			break;
			case 4:System.exit(0);
			break;
		}
		}
		while(choice!=0);
	}
	public static void creating()
	{
		int ch=1;
		while(ch==1)
		{
			StructNode sn=new StructNode();
			System.out.println("enter the data:");
			sn.data=s.nextInt();
			sn.prev=null;
			sn.next=null;
			if(head==null)
			{
				head=temp=sn;
			}
			else
			{
				sn.prev=temp;
				temp.next=sn;
				temp=temp.next;
			}
			System.out.println("do you want to continue(1/0):");
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
		}
	}
	public static void insertatbeg()
	{
		StructNode sn=new StructNode();
		System.out.println("enter the data");
		sn.data=s.nextInt();
		sn.next=null;
		sn.prev=null;
		sn.next=head;
		head.prev=sn;
		head=sn;
		
	}
}

