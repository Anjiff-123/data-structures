package linkedlistspractice;
class Node1
{
	int data;
	Node1 left;
	Node1 right;
	Node1 root;
	Node1 temp;
	public Node1(int data)
	{
		this.data=data;
	}
}
public class BinaryTree2 {
static Node1 root=null,temp;
public static void main(String[] args) {
	create();
	Inorder(root);
	System.out.println();
	Preorder(root);
	System.out.println();
	Postorder(root);
	
}
public static void create() {
	Node1 n=new Node1(1);
	Node1 n1=new Node1(2);
	Node1 n2=new Node1(3);
	Node1 n3=new Node1(4);
	Node1 n4=new Node1(5);
	root=n;
	n.left=n1;
	n.right=n2;
	n1.left=n3;
	n1.right=n4;
}
public static void Inorder(Node1 temp)
{
	if(temp==null)
	{
		return;
	}
	Inorder(temp.left);
	System.out.println(temp.data);
	Inorder(temp.right);
}
public static void Preorder(Node1 temp)
{
	if(temp==null)
	{
		return;
	}
	System.out.println(temp.data);
	Preorder(temp.left);
	Preorder(temp.right);
}
public static void Postorder(Node1 temp)
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
