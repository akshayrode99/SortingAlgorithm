package InsertionSort;

public class InsertionSortAlgorithm {
	public static void main(String[] args) {
		
		int a[] = {66 , 56 , 34 , 84 , 45 , 65};
		
		int temp ;
		int j ; 
		 
		int size = a.length;
		
		for(int i = 1 ; i < size ; i++) {
			
			temp = a[i];
			j=i;
			
			while(j > 0 && a[j-1] > temp) {
				
				a[j] = a[j-1];
				j = j-1;
			}
			a[j] = temp ;
		}
		
		for(int z = 0 ; z < a.length ; z++) {
			System.out.print(a[z]+ " ,");
		}
	}
}
