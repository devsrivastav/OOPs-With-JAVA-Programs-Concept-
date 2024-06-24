package StackProgramming;
import java.util.Stack;
public class StackExample2 {

	public static void main(String[] args) {
		//Creating Stack
		Stack<Integer>Stack = new Stack<>();
		
		//Pushing element into the stack
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		
		//Popping an element
		int poppedElement = Stack.pop();
		System.out.println("Popped element : "+poppedElement);
		
		//Checking if the stack isEmpty
		System.out.println("Is the stack empty ? ");
		int position = Stack.search(0);
		if(position!= -1) {
			System.out.println("element 20 is at position "+position + "from the top of the stack");
		}
		else {
			System.out.println("Element 20 not found in the stack");
		}

	}

}
