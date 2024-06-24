package VectorProgram;
import java.util.Vector;
public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("Harry");
		vector.add("Dev");
		vector.add("Sonu");
		vector.add("Himanshu");
		System.out.println("Elements at index 0 : "+vector.get(0));
		System.out.println("Elements at index 1 : "+vector.get(1));
		System.out.println("Iterating over the vector ");
		for(String names : vector) {
			System.out.println(names);
		}
		// Removing names from vector 
		vector.remove(1);
		for(String names : vector) {
			System.out.println(names);
		}

	}

}
