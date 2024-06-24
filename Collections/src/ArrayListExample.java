import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("DEV");
		list.add("Omji");
		list.add("Karan");
		list.add("Harshit");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
