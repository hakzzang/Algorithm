package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		print(queue);
		System.out.println(String.format("poll: %d", queue.poll()));
		System.out.println(String.format("poll: %d", queue.poll()));
		System.out.println(String.format("poll: %d", queue.poll()));
		System.out.println(String.format("peek: %d", queue.peek()));
		System.out.println(String.format("peek: %d", queue.peek()));
	}
	
	public static void print(Queue<Integer> queue) {
		System.out.print("data: ");
		queue.forEach((value)->{
			System.out.print(value);
		});
		System.out.println(String.format(" size: %d", queue.size())); 
	}
}
