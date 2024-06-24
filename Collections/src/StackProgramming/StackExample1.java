package StackProgramming;
import java.util.*;
public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> Stack = new Stack<String>();
		Stack.push("Khushi");
		Stack.push("Jigyasa");
		Stack.push("Kajal");
		Stack.push("Rashi");
		Stack.push("Shweta");
		Stack.pop();
		Iterator<String> itr = Stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
