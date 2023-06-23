package asignment;
import java.util.Scanner;
public class pgm2 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a:");
	boolean a=s.nextBoolean();
	System.out.println("enter b:");
	boolean b=s.nextBoolean();
	System.out.println(monkey(a,b));
	}
	public static Boolean monkey(boolean a,boolean b) {
		if((a==true&&b==true)||(a==false&&b==false))
		{
			return true;
		}
		else
		return false;
	}
}
