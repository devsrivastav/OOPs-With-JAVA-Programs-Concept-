import java.util.ArrayList;
import java.util.Iterator;
public class IteratorInterfaceExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String fruits = iterator.next();
			System.out.println(fruits);
		}
		iterator = list.iterator();
		while(iterator.hasNext()) {
			String fruits = iterator.next();
			if(fruits.equals("Orange")) {
				iterator.remove();
			}
		}
		System.out.println("List after removal: ");
		for(String fruits : list) {
			System.out.println(fruits);
		}
	}

}
