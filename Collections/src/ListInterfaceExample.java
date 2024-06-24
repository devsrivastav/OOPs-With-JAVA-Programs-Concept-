import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ListInterfaceExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("Elements at the index 0: "+numbers.get(0));
		System.out.println("Elements at the index 1: "+numbers.get(1));
		
		//Iterating over the list
		for(int num : numbers) {
			System.out.println(num);
		}

		//Removing an elements
		numbers.remove(1);
		System.out.println("List after removal: ");
		for(int num : numbers) {
			System.out.println(num);
		}

	}

}
