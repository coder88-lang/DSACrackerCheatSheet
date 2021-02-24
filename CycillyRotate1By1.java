/*Given an array, rotate the array by one position in clock-wise direction.
 

Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1*/
public class CycillyRotate1By1 {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {1,2,3,4,5};
		System.out.println("Given array...");
		print(arr, n);
		rotateOneByOne(arr, n);
		System.out.println("\nAfter rotating elements cyclically...");
		print(arr, n);
		
	}
	public static void rotateOneByOne(int a[], int n) {
		int last =  a[n-1];
		for (int i = n-1; i>=1; i--) {
			a[i] = a[i-1];
		}
		a[0] = last;
	}
	public static void print(int a[], int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
