
/**
 * 
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yusra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		reverseQueue();
		System.out.print(q.remove());
		System.out.print(q.remove());
		System.out.print(q.remove());
		System.out.println(q.remove());
		int arr[] = { 1, 2, 3, 4, 3 };
		System.out.println(repeatedInt(arr));

	}

	
	// 1. reverse a queue using enqueue and or dequeue, cannot use another data
	// structures
	public static void reverseQueue() {
		if (q.isEmpty())
			return;

		else {
			int temp = q.remove();
			reverseQueue();
			q.add(temp);
		}
	}

	public static int repeatedInt(int[] arr) {
		// Calculating length of the array
		int max_int = arr.length - 1;
		// Sum of integers from 1 to 3 = (3 X 4)/2 = 6
		int sum = (max_int * (max_int + 1)) / 2;
		// Variable to store the sum of array elements initialized with 0
		int arr_sum = 0;
		// Calculating the sum of all array elements using a for loop
		for (int i = 0; i < arr.length; i++)
			arr_sum += arr[i];
		// Repeated element in array = Sum of array elements - Sum of integers from 1 to
		// greatest integer
		return (arr_sum - sum);
	}

}
