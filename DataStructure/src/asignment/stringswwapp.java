package asignment;

public class stringswwapp {
	static String s1;
	static String s2;
	public static void main(String[] args) {
		s1="Hellooooooo";
		s2="World";
		s11(s1);
		s22(s2);
		System.out.println(s1);
	}
	public static void s11(String s1) {
		s1=s2;
		System.out.println(s1);
	}
	public static void s22(String s2) {
		s2=s1;
		System.out.println(s1);
	}
}
