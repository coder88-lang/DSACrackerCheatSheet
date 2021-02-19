/*Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
*/
//reversel algorithm..
public class ReverseArrayString {
	public static void main(String[] args) {
		int a[] = {1, 2, 3};
		System.out.println("Reverse...");
		rev(a, a.length);
		printArray(a, a.length);
		
	}
	//function tht reverse the array...REVERSAL ALGORITHM
	//TC = O(n)
	public static void rev(int a[], int n) {
		int s = 0; 
		int e = a.length-1;
		while (s < e) {
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}
	
	static void printArray(int arr[], int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
}
