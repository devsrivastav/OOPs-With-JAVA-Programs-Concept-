package QueueInterfaceProgram;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>deque = new ArrayDeque<>();
		deque.addFirst("Element 1");
		deque.addFirst("Element 2");
		deque.addLast("Element 3");
		deque.addLast("Element 4");
		System.out.println("Deque: "+deque);
		System.out.println("Removed from front: "+deque.removeFirst());
		System.out.println("Removed from end: "+deque.removeLast());
		System.out.println("Deque after removed: "+deque);
	}

}
