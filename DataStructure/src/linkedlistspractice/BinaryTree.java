package linkedlistspractice;
import java.security.PublicKey;
import java.util.Scanner;
public class BinaryTree
{
	static Node left=null,right=null,root=null,temp=null,temp1;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice;
		do
		{
			System.out.println("select any option:");
			System.out.println("1.creation\n2.print in in-order\n3.print in pre-order\n4.Postorder\n5.exit");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:root=creation();
			break;
			case 2:Inorder(temp=root);
			break;
			case 3:Preorder(temp=root);
			break;
			case 4:Postorder(temp=root);
			break;
			case 5:System.exit(0);
			break;
			}
			System.out.println("do you want to continue(1/0)");
			choice=s.nextInt();
			
		}
		while(choice!=0);
	}
	public static Node creation() {
			Node n=new Node();
			System.out.println("enter data:");
			n.data=s.nextInt();
			System.out.println("do you want to create node on left(1/0):");
			int nl=s.nextInt();
			if(nl==1)
			{
				n.left=creation();
			}
			else
			{
				n.left=null;
			}
			System.out.println("do you want to create node on right(1/0):");
			int nr=s.nextInt();
			if(nr==1)
			{
				n.right=creation();
			}
			else
			{
				n.right=null;
			}
			return n;
	}
	public static void Inorder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		Inorder(temp.left);
		System.out.println(temp.data);
		Inorder(temp.right);
	}
	public static void Preorder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		System.out.println(temp.data);
		Preorder(temp.left);
		Preorder(temp.right);
	}
	public static void Postorder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		Postorder(temp.left);
		Postorder(temp.right);
		System.out.println(temp.data);
	}
}
