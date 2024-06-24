import java.util.*;
public class RemovingArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		System.out.println(fruits);
		
		//Removing Array Elements
		fruits.remove("Orange");
		System.out.println("After removal of elements : \n"+fruits);
		fruits.remove(1);
		System.out.println("After Removal elements : \n"+fruits);

	}

}
