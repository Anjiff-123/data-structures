package asignment;
import java.util.*;
public class p4 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			ArrayList a=new ArrayList();
			a.add(10);
			a.add(223);
			a.add(15);
			a.add(2,44);
			ArrayList a1=new ArrayList();
			a1.add(120);
			a1.add(223);
			a1.add(135);
			a1.add(2,44);
			
			a1.addAll(a);
			System.out.println(a1);
			//a1.retainAll(a);
			//System.out.println(a1);
			HashSet h=new HashSet(a1);
			System.out.println(h);
			//Collections.sort(a1);
			//a1.removeAll(a);
			//System.out.println(a1);
			/*Iterator i=a.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}*/
			/*for(Object o:a)
			{
				System.out.println(o);
			}*/
			/*for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}*/
			
		}
}
