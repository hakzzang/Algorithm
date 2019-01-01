package DataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//큐 생성
		queue.offer(5);//데이터를 집어 넣음
		queue.offer(1);//데이터를 집어 넣음
		queue.offer(2);//데이터를 집어 넣음 
		
		queue.offer(3);//데이터를 집어 넣음
		queue.offer(4);//데이터를 집어 넣음
		print(queue);//큐를 MIN HEAP으로 SORT해서 출력
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