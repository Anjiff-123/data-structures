package asignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class WorkingwithThrows {
	
	public static void m() throws Exception
	{
		FileInputStream fis=new FileInputStream("C://New folder//sample.txt");
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
	}
	public static void m1() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("C://New folder//sample.txt");
		String s="i am from tpt,idhi final";
		fos.write(s.getBytes());
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		m();
		m1();
	}

}
