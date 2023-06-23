package asignment;
import java.util.*;
public class p111 {
	    public static void main(String[] args) {
	    LinkedList l=new LinkedList();
	    l.add(1);
	    l.add(20);
	    l.add(3);
	    l.add(true);
	    System.out.println(l);
	    l.addFirst('d');
	    System.out.println(l);
	    l.add(2, 22);
	    System.out.println(l);
	    l.addLast('l');
	    System.out.println(l);
	    System.out.println(l.getFirst());
	    System.out.println(l.get(3));
	    System.out.println(l.getLast());
	    l.removeFirst();
	    System.out.println(l.removeFirst());
	    System.out.println(l);
	    System.out.println(l.removeLast());
	    System.out.println(l);
	   
	    }
}

