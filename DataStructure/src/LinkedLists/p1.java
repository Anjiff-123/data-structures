package LinkedLists;
import java.util.Scanner;
public class p1 {
	static StructNode head=null,head1=null;
	static StructNode temp=null,temp1=null;
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) 
	{
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
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		head1=null;
		temp1=null;
		ch=1;
		while(ch==1)
		{
			StructNode sn1=new StructNode();
			System.out.println("enter data");
			sn1.data=s.nextInt();
			sn1.next=null;
			if(head1==null)
			{
				head1=temp1=sn1;
			}
			else
			{
				temp1.next=sn1;
				temp1=sn1;
			}
			System.out.println("do you want to create node(1/0)");
			ch=s.nextInt();
		}
		temp1=head1;
		System.out.println("entered elements are:");
		while(temp1!=null)
		{
			System.out.println(temp1.data);
			temp1=temp1.next;;
		}
		System.out.println();
		temp1=head1;
		temp=head;
		while(temp!=null||temp1!=null)
		{
			System.out.println(temp.data);
			System.out.println(temp1.data);
			temp=temp.next;
			temp1=temp1.next;
		}
	}
}
