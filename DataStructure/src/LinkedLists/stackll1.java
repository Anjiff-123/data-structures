package LinkedLists;
import java.util.Scanner;
public class stackll1 {
	static Node top=null,temp=null;
	static int choice=1;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		do 
		{
			System.out.println("select an option");
			System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
			System.out.println("enter your choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:push();
					break;
				case 2:pop();
					break;
				case 3:peek();
					break;
				case 4:display();
					break;
				case 5:System.exit(0);
					break;
			}
			
		 }
		 while(choice!=0);
	}
	public static void push() 
	{
		while(choice==1)
		{
			Node n=new Node();
			System.out.println("enter data:");
			n.data=s.nextInt();
			n.add=top;
			top=n;
			System.out.println("do you want to continue:");
			choice=s.nextInt();
		}
	}
	public static void pop() 
	{
		if(top==null)
			System.out.println("stack is underflow");
		else
			while(choice==1)
			{
				temp=top;
				top=top.add;
				System.out.println("deleted data:"+temp.data);
				temp.add=null;
				temp.data=0;
				temp=null;
				System.out.println("do you want to continue(1/0):");
				choice=s.nextInt();
			}
	}
	public static void peek() {
		System.out.println(temp.data);
		
	}
	public static void display() {
		temp=top;
		while(temp!=null)
			System.out.println(temp.data);
			temp=temp.add;
	}
	
}
