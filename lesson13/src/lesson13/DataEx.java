package lesson13;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Queue<String> queue = new LinkedList<String>();
		queue.add("A1");
		queue.add("B2");
		queue.add("C3");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		Deque<String> deque = new LinkedList<String>();
		deque.add("1");
		deque.add("2");
		deque.addFirst("3");
		System.out.println(deque);
		
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeLast());
	}
}
