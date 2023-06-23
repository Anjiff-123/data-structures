package LinkedLists;
import java.util.Scanner;
public class p2 {
	static StructNode head=null;
	static StructNode temp=null;
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
	}
}