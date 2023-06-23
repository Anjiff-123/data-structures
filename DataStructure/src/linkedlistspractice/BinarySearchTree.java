package linkedlistspractice;
import java.security.PublicKey;
import java.util.Scanner;
public class BinarySearchTree
{
	static Node left=null,right=null,root=null,temp=null,temp1;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice;
		do
		{
			Node n=new Node();
			System.out.println("enter data:");
			n.data=s.nextInt();
			n.left=null;
			n.right=null;
			if(root==null)
			{
				root=n;
			}
			else
			{
				create(root,n);
			}
			
			System.out.println("do you want to create node(1/0)");
			choice=s.nextInt();
		}
		while(choice!=0);
		Inorder(temp=root);
	}
	public static void create(Node temp,Node n) 
	{
		if(temp==null)
		{
			return;
		}
		else if(n.data<temp.data)
		{
			if(temp.left==null)
				temp.left=n;
			else
			{
				temp=temp.left;
				create(temp,n);
			}
		}
		else
		{
			if(temp.right==null)
				temp.right=n;
			else
			{
				temp=temp.right;
				create(temp,n);
			}
		}
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
}
