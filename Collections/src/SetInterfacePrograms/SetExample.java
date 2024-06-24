package SetInterfacePrograms;
import java.util.Set;
import java.util.HashSet;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Orange");
		set.add("Mango");
		set.add("Apple");
		System.out.println("set: "+set);
	}

}
