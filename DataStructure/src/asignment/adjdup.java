package asignment;
import java.util.Scanner;
public class adjdup {
	static char stack[]=new char[100];
	static int top=-1;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the string:");
		String s1=s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			push(s1.charAt(i));
		}
		display();
	}
	public static void push(char c) {
		if(top==-1)
		{
			top++;
			stack[top]=c;
		}
		else
		{
			if(stack[top]==c)
			{
				pop();
			}
			else
			{
				top++;
				stack[top]=c;
			}
		}
	}
	public static void pop() {
		top--;
	}
	public static void display() {
		for(int i=0;i<=top;i++)
		{
			System.out.print(stack[i]);
		}
	}
}
