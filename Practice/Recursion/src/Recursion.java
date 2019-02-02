//Recursion: 5.1, 5.2, 5.5, 5.7, 5.10, 5.17, 5.18, 5.21, 5.23


public class Recursion {

	public static void main(String[] args) {
		int[] array = { 1, 3, 6, 4, 7, 4 };
		int maxElement = maxElementInArray(array, array.length);
		System.out.println(maxElement);
		
		int[] array2 = { 1, 3, 4, 4, 6, 7 };
		int searchElement = binarySearch(array2, 0, array2.length - 1, 4);
		System.out.println(searchElement);

		double harmonicNumber = harmonicNumber(10);
		System.out.println(harmonicNumber);	
			
		int[][] array2d = {{1, 3, 4, 4 ,6,7 },{ 1, 3, 4, 4,6 ,7},{ 1, 3, 4, 4,6,7 }};
		int sumOf2dArray = sumOf2dArray(array2d, array2d.length-1,array2d[0].length-1, array2d[0].length-1  );
		System.out.println(sumOf2dArray);

		
		String strToReverse = "pots&pans";
		String reverseString = reverseString(strToReverse, strToReverse.length()-1);
		System.out.println(reverseString);
		
		String strPal = "racecar";
		boolean palindrome = palindrome(strPal, 0, strPal.length()-1 ) ;
		System.out.println(palindrome);
		
		
	}
	

	public static int maxElementInArray(int[] A, int n) {
		if (n == 0)
			return -1;
		else if (n == 1)
			return A[0];
		else {
			int max;
			if (A[n - 1] > maxElementInArray(A, n - 1))
				return A[n - 1];
			else
				return maxElementInArray(A, n - 1);
		}

	}

	public static int binarySearch(int[] array, int low, int high, int elem) {
		if (low > high) // zero elements in subarray
			return -1;

		else {
			int mid = (low + high) / 2;
			if (elem < array[mid]) 
				return binarySearch(array, low, mid - 1, elem);
			
			if (elem > array[mid]) 
				return binarySearch(array, mid + 1, high, elem);

			if (elem == array[mid]) 
				return mid;
		}
		return -1;
	}
	
	//nth Harmonic number -- sum of (1/k) from 1 to n 
	public static double harmonicNumber(int n ) {
		if (n==1)
			return 1/(double)n; 
		else 
			return (1/(double)n) + harmonicNumber(n-1);
	}
		
	
	//compute the sum of all the elements in a two-dimensional array of integers
	public static int sumOf2dArray(int[][]array, int n1, int n2, int n ) {
		if (n1==0 && n2==0)
			return array[0][0];
		
		if (n2==0) 
		return 	array[n1][n2]+ sumOf2dArray(array, n1-1, n, n );
			
		return  array[n1][n2]+sumOf2dArray(array, n1, n2-1, n );
	
	}
		
	
	public static String reverseString(String str, int n ) {
		if (n==0)
			return str.charAt(n)+"";
		else 
			return str.charAt(n) + reverseString(str,n-1);
		
	}
	
	//method that determines if a string str is a palindrome
	public static boolean palindrome(String str, int start, int end ) {
		
		if (start>=end)
			return true;
		
		if (str.charAt(start)==str.charAt(end)) 
			return palindrome(str, start+1,  end-1 );
		else 
			return false; 
		
	}
	
	//C-5.21 Given an unsorted array, A, of integers and an integer k, describe a recursive
	//algorithm for rearranging the elements in A so that all elements less than or equal
	//to k come before any elements larger than k. What is the running time of your
	//algorithm on an array of n values?
	
	
	
	//C-5.23 Describe a recursive algorithm that will check if an array A of integers contains
	//an integer A[i] that is the sum of two integers that appear earlier in A, that is, such
	//that A[i] = A[ j] +A[k] for j,k < i.
}
