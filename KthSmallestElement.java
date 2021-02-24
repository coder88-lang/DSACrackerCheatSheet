import java.util.Collections;
import java.util.PriorityQueue;

/*Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.*/

//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

public class KthSmallestElement {
	public static void main(String[] args) {
		int arr[] = {11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 4};
		int k = 3;
		System.out.println("Given array...");
		print(arr, arr.length);
		System.out.println();
		kthLargestElement(arr, arr.length, k);
		kthSmallestElement(arr, arr.length, k);
	}
	public static void kthLargestElement(int a[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i<n; i++) {
			pq.add(a[i]);
			if (pq.size() > k) {
				pq.poll();
			}
			pq.peek();
		}
		//return the first kth element...
		while (pq.size() > 0) {
			System.out.println(pq.poll());
		}
	
	}
	public static void kthSmallestElement(int a[], int n, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i<n; i++) {
			pq.add(a[i]);
			if (pq.size() > k) {
				pq.poll();
			}
			pq.peek();
		}
		//return the first kth element...
		while (pq.size() > 0) {
			System.out.println(pq.poll());
		}
	
	}
	public static void print(int a[], int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
