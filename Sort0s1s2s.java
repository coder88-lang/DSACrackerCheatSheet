
public class Sort0s1s2s {
	public static void main(String[] args) {
		int N = 5;
		int arr[]= {0, 2, 1, 2, 0};
		print(arr, N);
		sort(arr, N);
		System.out.println();
		
		print(arr, N);
	}
	
	public static void sort(int a[], int n) {
	
		//making three pointers l, h, mid
		int l = 0;
		int h = n-1;
		int mid = 0;
		while (mid <= h) {
			int temp = 0;
			switch(a[mid]) {
			case 0 : {
				temp = a[l];
				a[l] = a[mid];
				a[mid] = temp;
				l++;
				mid++;
				break;
			}
			case 1 : {
				mid++;
				break;
			}
			case 2 : {
				temp = a[mid];
				a[mid] = a[h];
				temp = a[h];
				h--;
				break;
			}
			}
		}
	}
	public static void print(int a[], int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
