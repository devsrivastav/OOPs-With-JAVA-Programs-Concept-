import java.util.*;
import java.io.*;
public class CollectionInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String>list = new LinkedList<String>();
		list.add("Dev");
		list.add("Kumar");
		list.add("Srivastav");
		System.out.println("The list is: "+ list);
		//Adding new List
		list.add("Last");
		list.add("Name");
		System.out.println("The new list is: "+ list);

	}

}
