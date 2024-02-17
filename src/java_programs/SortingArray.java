package java_programs;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4, 6,2, 3, 2, 2, 5, 7};
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		System.out.println();
		
		sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

	public static void sort(int[] a) {
		int l = a.length;
		int temp;
		
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
