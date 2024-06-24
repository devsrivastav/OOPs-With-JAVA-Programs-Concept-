package QueueInterfaceProgram;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Element 1");
		queue.add("Element 2");
		queue.add("Element 3");
		while(! queue.isEmpty()) {
			System.out.println("Removed element : "+queue.remove());
		}

	}

}
