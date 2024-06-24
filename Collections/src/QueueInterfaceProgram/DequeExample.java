package QueueInterfaceProgram;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>deque = new ArrayDeque<>();
		//Adding elements to the front of the deque
		deque.addFirst("Element 1");
		deque.addFirst("Element 2");
		//Adding elements to the end of deque 
		deque.addLast("Element 3");
		deque.addLast("Element 4");
		//Printing the Deque
		System.out.println("Deque: "+deque);
		//Remove elements from front & end 
		System.out.println("Removed from front: "+deque.removeFirst());
		System.out.println("Removed from end: "+deque.removeLast());
		System.out.println("Deque after removed: "+deque);
	}

}
