package asignment;

public class pgm30 {
public static void main(String[] args) {
	String s="TestYantra";
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!='a')
		{
			s2=s2+s.charAt(i);
		}
	}
	System.out.println(s2);
}
}
