/**
 * Lab2 
 * In this function, you will enqueue five elements {1, 2, 3, 4, 5} and print the 
 * values as you dequeue these. The order of these elements being printed must 
 * be the same as the insertion process.
 */

/**
 * @author yusra
 *
 */
public class Test {

	public static void main(String[] args) {
		SQueue<Integer> queue=new SQueue <Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
