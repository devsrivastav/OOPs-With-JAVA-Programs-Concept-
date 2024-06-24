import java.util.*;
public class SizeOfArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		//Adding fruits 
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Kiwi");
		fruits.add("Berry");
		for(String element : fruits) {
			System.out.println(element);
		}
		System.out.println("Total Elements : "+fruits.size());

	}

}
