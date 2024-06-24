package QueueInterfaceProgram;

import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(3);
		queue.add(2);
		queue.add(1);
		while(! queue.isEmpty()) {
			System.out.println("Removed element : "+queue.remove());
		}

	}

}
