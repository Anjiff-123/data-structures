package asignment;
import java.util.Scanner;
public class parmatching {
	static int top=-1;
	static char[] stack=new char[100];
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter stringpar:");
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
		if(c=='{'||c=='['||c=='(')
		{
			top++;
			stack[top]=c;
		}
	}
	else
	{
		if((stack[top]=='['||stack[top]=='{'||stack[top]=='('))
		{
			top++;
			stack[top]=c;
		}
		else
		{
			if(c=='}' && stack[top]=='}')
			{	
				//if(stack[top]=='{')
				//{
					pop();
				//}
			}
			else if(c==']' && stack[top]=='[')
			{
				//if(stack[top]=='[')
				//{
					pop();
				//}
			}
			else if(c==')' && stack[top]=='[')
			{
				//if(stack[top]=='(')
				//{
					pop();
				//}	
			}
		}
	}}
public static void pop() {
	top--;
}
public static void display()
{
	if(top==-1)
		System.out.println("par matched");
	else
		System.out.println("par not matched");
		
}
}
