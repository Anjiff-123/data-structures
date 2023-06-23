package asignment;
import java.util.*;
import java.util.Map.Entry;
public class p23 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		HashMap h=new HashMap<>();
		String s1="aabbbccdddeee";
		char ch[]=s1.toCharArray();
		/*for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			h.put(ch[i], count);
		}
		System.out.println(h);*/
		boolean b[]=new boolean[ch.length];
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false) {
				count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(ch[i]+":"+count);
			}
		}
	}
}
