package asignment;
import java.util.Scanner;
public class pgm19 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a:");
		int a=s.nextInt();
		System.out.println(multiple(a));
	}
	public static boolean multiple(int a){
		if(a%3==0||a%5==0)
			return true;
	}
}
