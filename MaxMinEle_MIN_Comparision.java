//METHOD 1...linear -- O(n)
/* In this method total no if comparision..
 *    1 + 2(n-2)..worst 
 *    
 */

/*
	  * //METHOD 2
	  
	 //1... divide the array into two half
	 //2...by using recursion find the minmax of both the half 
	 //3...compare both the minmax...and return the answer
	 static Pair getMinMaxMethod2(int a[], int low, int high) {
		 Pair final_minmax = new Pair();
		 Pair lftSide_minmax = new Pair();
		 Pair rgtSide_minmax = new Pair();
		 int mid;
		 //if only one element present
		 if (high == 1) {
			 final_minmax.min = a[0];
			final_minmax.max = a[0];
			return final_minmax;
		 }
		 
		 //if two only 2 elements present
		 if (high == low + 1) {
			 if (a[0] > a[1]) {
				 final_minmax.min = a[1];
				 final_minmax.max = a[0];
			 } else {
				 final_minmax.min = a[0];
				 final_minmax.max = a[1];
			 }
			 return final_minmax;
		 }
		 //Now divide the array into two half
		 mid = (high + low)/2;
		 lftSide_minmax = getMinMaxMethod2(a, 0, mid);   //gives us minmax of left half
		 lftSide_minmax = getMinMaxMethod2(a, mid+1, high);  //gives us minmax of right half
		 
		 if (lftSide_minmax.min < rgtSide_minmax.min) {
			 final_minmax.min = lftSide_minmax.min;
		 } else {
			 final_minmax.min = rgtSide_minmax.min;
		 }
		 
		 if (lftSide_minmax.max > rgtSide_minmax.max) {
			 final_minmax.max = lftSide_minmax.max;
		 } else {
			 final_minmax.max = rgtSide_minmax.max;
		 }
		 return final_minmax;
	 }
	 */
public class MaxMinEle_MIN_Comparision {
	 public static void main(String args[]) {
		 int arr[] = {1000, 11, 445, 1, 330, 3000};
	     int arr_size = 6;
	     Pair minmax = getMinMax(arr, arr_size);
	   //  Pair minmax = getMinMaxMethod2(arr, 0, arr_size-1);
	     System.out.printf("\nMinimum element is %d", minmax.min);
	     System.out.printf("\nMaximum element is %d", minmax.max);
	 
	    }
	 static class Pair{
		 int min;
		 int max;
	 }
	 //Method 1
	 static Pair getMinMax(int a[], int n) {
			Pair minmax = new Pair();
			
			//If only 1 element present
			if (n == 1) {
				minmax.min = a[0];
				minmax.max = a[0];
				return minmax;
			}
			//set min or max..as index 0 and 1
			if (a[0] > a[1]) {
				minmax.max = a[0];
				minmax.min = a[1];
			} else {
				minmax.max = a[1];
				minmax.min = a[0];
			}
			//loop from 2 to n-1 index...update the min and max element and return
			for (int i = 2; i < n; i++) {
				if (minmax.max < a[i]) {
					minmax.max = a[i];
				} 
				else if (minmax.min > a[i]) {
					minmax.min = a[i];
				}
			}
			return minmax;
		 }       
	 
}
