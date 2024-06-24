package LinkedListProgrammings;
import java.util.*;
public class RemovingLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("Delhi");
		linkedlist.add("Ghaziabad");
		linkedlist.add("Gorakhpur");
		linkedlist.add("Kushinagar");
		System.out.println(linkedlist);
		
		// Removing the elements from adding 
		linkedlist.remove("Delhi");
		System.out.println("After Deletion : \n"+linkedlist);
		linkedlist.remove("Ghaziabad");
		System.out.println("After Deletion : \n"+linkedlist);

	}

}
