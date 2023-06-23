package linkedlistspractice;
public class BinarySearchTree2 {
static Node root=null,temp;
static int a[]= {2,13,6,7,18,79,69,78,69,73};
public static void main(String[] args){
		int i=0;
		while(i<a.length)
		{
			Node n=new Node();
			n.data=a[i];
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
			i++;
		}
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
