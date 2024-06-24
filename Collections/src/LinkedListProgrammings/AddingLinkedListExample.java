package LinkedListProgrammings;
import java.util.*;
public class AddingLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Jigyasa");
		al.add("Shweta");
		al.add("Ishan");
		al.add("Rashi");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext());{
			System.out.println(itr.next());
		}

	}

}
