package co.edureka.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>(); 			// Polymorphic Statement
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		// For user defined objects like student, use Comparator API !!
		
		for(int i=10;i>0;i--)
			queue.add(i); // to add data in Queue | queue.add(new Integer(i)); |  Auto-Boxing
		
		// As per data which we added:
		// (head) 10  9  8  7  6  5  4  3  2  1 (tail)
		
		// PriorityQueue Sorts the data for us
		// (head) 1  2  3  4  5  6  7  8  9  10 (tail)
		
		// Read the head of Queue | Peeking
		/*System.out.println("Size of queue is: "+queue.size());
		int head = queue.peek();
		System.out.println("head of queue is: "+head);
		
		System.out.println();
		
		// Remove the head of the queue
		queue.poll();
		// (head) 2  3  4  5  6  7  8  9  10 (tail)
		
		System.out.println("Size of queue now is: "+queue.size());
		head = queue.peek();
		System.out.println("head of queue now is: "+head);*/
		
		// What is the output below ??
		for(int i=1;i<=queue.size();i++){
			queue.poll();
			System.out.println(queue.peek()); 
		}
		
		

	}

}
