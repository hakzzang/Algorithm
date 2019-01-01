package DataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//ť ����
		queue.offer(5);//�����͸� ���� ����
		queue.offer(1);//�����͸� ���� ����
		queue.offer(2);//�����͸� ���� ���� 
		
		queue.offer(3);//�����͸� ���� ����
		queue.offer(4);//�����͸� ���� ����
		print(queue);//ť�� MIN HEAP���� SORT�ؼ� ���
		System.out.println(String.format("poll: %d", queue.poll()));//poll
		System.out.println(String.format("poll: %d", queue.poll()));//poll
		System.out.println(String.format("poll: %d", queue.poll()));//poll
		System.out.println(String.format("poll: %d", queue.poll()));//poll
		System.out.println(String.format("poll: %d", queue.poll()));//poll
		
	}
	
	public static void print(Queue<Integer> queue) {
		System.out.print("data: ");
		queue.forEach((value)->{
			System.out.print(value); 
		});
		System.out.println(String.format(" size: %d", queue.size())); 
		
	}
}