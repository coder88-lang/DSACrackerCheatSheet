//Move all the negative elements to side of the array...
/*
Approach 1:
The idea is to simply apply the partition process of quicksort. 

App..2
Two Pointer Approach: The idea is to solve this problem with constant space and
 linear time is by using a two-pointer or two-variable approach 
where we simply take two variables like left and right which hold the 0 and N-1 indexes.
*/
public class MoveTheELement {
	public static void main(String[] args) {
		int a[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6};
		print(a, a.length);
		MoveTheElements(a, a.length);
		System.out.println();
		print(a, a.length);
	}
	public static void MoveTheElements(int a[], int n) {
		int  lft = 0;
		int rgt = n-1;
		while (lft <= rgt) {
			if (a[lft] < 0 && a[rgt] < 0) {
				lft++;
			} else if (a[lft] < 0 && a[rgt] > 0) {
				lft++;
				rgt--;
			} else if (a[lft] > 0 && a[rgt] < 0) {
				int t = a[lft];
				a[lft] = a[rgt];
				a[rgt] = t;
				lft++;
				rgt--;
			} else {
				lft++;
				rgt--;
			}
		}
	}
	public static void print(int a[], int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
