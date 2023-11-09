import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingListAndQueue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Queue using Linked List");
		Queue<Integer> l1 = new LinkedList<>();
		// add operations in queue
		l1.add(10);
		l1.add(12);
		l1.add(50);
		l1.add(89);
		l1.add(20);

		System.out.println("Size : " + l1.size());
		System.out.println("First element : " + l1.peek());
		System.out.println("Display Queue : " + l1);

		l1.poll();
		System.out.println("Display Queue : " + l1);
		l1.remove(50);
		System.out.println("Display Queue : " + l1);

		System.out.println("Queue using ArrayDeque");
		Queue<Integer> q = new ArrayDeque<>();
		// add operations in queue
		q.add(10);
		q.add(12);
		q.add(50);
		q.add(89);
		q.add(20);

		System.out.println("Size : " + q.size());
		System.out.println("First element : " + q.peek());
		System.out.println("Display Queue : " + q);

		
		System.out.println("lll"+q.poll());
		System.out.println("Display Queue : " + q);
		q.remove(50);
		System.out.println("Display Queue : " + q);

	}
}
