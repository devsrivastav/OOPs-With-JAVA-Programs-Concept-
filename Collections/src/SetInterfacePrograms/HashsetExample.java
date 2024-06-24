package SetInterfacePrograms;
import java.util.HashSet;
import java.util.Set;
public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>set = new HashSet<>();
		set.add("Dev");
		set.add("Kartik");
		set.add("Ishan");
		set.add("Rashi");
		System.out.println("Set: "+set);
		//Removing set 
		set.remove("Dev");
		System.out.println("Set after removal: "+set);
	}

}
