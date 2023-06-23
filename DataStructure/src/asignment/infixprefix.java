package asignment;
import java.util.Scanner;

import LinkedLists.stackll1;
public class infixprefix
{
	static Scanner s=new Scanner(System.in);
	static char stack1[]=new char[100];
	static char stack2[]=new char[100];
	static int top1=-1;
	static int top2=-1;
	static int temp=0;
	public static void main(String[] args) 
	{
		String s1=s.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='0'&&s1.charAt(i)<='9')||(s1.charAt(i)<='a'&&s1.charAt(i)<='z'))
			{
				pushdata(s1.charAt(i));
			}
			if((s1.charAt(i)=='+'||s1.charAt(i)=='-')||(s1.charAt(i)=='/'||s1.charAt(i)=='*'||s1.charAt(i)=='%'))
			{
				pushoper(s1.charAt(i));
			}
		}
	}
	public static void pushdata(char c)
	{
		if(top1==-1)
		{
			top1++;
			stack1[top1]=c;
		}
		else
		{
			if(stack2[top2]=='+')
			{
				stack1[top1]=add(stack1[top1],c);
			}
				
		}
	}
	public static void pushoper(char c)
	{
		if(top2==-1)
		{
			top2++;
			stack1[top2]=c;
		}
		else
		{
			top2++;
			stack1[top2]=c;
		}
	}
	public static int add(int a,char b) {
		
		temp=a+b;
		stack1[top1]=temp;
		
	}
	public static void pop()
	{
		top1--;
	}
}
