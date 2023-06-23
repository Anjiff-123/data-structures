package asignment;
import java.util.Scanner;
public class pgm18 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter if parrot is speaking or not:");
	boolean b1=s.nextBoolean();
	System.out.println("enter hour:");
	int hour =s.nextInt();
	if(hour>=0&&hour<=23)
		System.out.println(parrotTrouble(b1,hour));
	}
	public static boolean parrotTrouble(boolean b1,int hour) {
		if(b1==true&&(hour<7||hour>20))
				return true;
		else
			return false;
	}
}
