package InsertionSort;

public class ArraySort {
	public static void main(String[] args) {

		int a[]= {84,46,23,53,34,52,33,58,38};

		int size = a.length;
		int min = a[0];
		int temp;

		for(int i=0 ; i < size ; i++) {
			min = a[i];

			for(int j = i+1 ; j<size ; j++) {

				if(min>a[j]) {

					temp = a[i];
					a[i]=a[j];
					a[j]=temp;

					min=a[i];
				}
			}
		}
		for(int y =0 ; y<a.length ; y++) {
			System.out.print(a[y]+", ");
		}
	}
}
