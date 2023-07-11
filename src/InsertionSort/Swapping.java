package InsertionSort;

public class Swapping {
	public static void main(String[] args) {
		
		int a [] = {22,7,9,2,4,53};

		int i ;
		int x = a.length;
		int min=a[0];
		int temp;

		for( i = 1 ; i<x ; i++) {
			
			if (min > a[i]) {
				
				temp = a[0];

				a[0]=a[i];
				a[i]=temp;
				
				min=a[0];                
			}
		}
		for(int y =0 ; y<a.length ; y++) {
			System.out.print(a[y]+", ");
		}
	}
}
