package asignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("sample.txt");//naming the text file
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");//creating the file
		}
		else {
			System.out.println("file is already present");
		}
		//giving the output
		FileOutputStream fos=new FileOutputStream(file);
		String s="i am from tpt";
		fos.write(s.getBytes());
		//to take the input
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fis.read();
		}
	}

}
