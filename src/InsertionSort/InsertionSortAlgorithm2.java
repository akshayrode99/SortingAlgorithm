package InsertionSort;

public class InsertionSortAlgorithm2 {
	public static void main(String[] args) {
		
		int a[]= {63 , 72 , 34 , 84, 26 , 93 , 73 , 38 };
		
		int temp , j ;
		int size = a.length;
		
		for(int i = 1 ; i < size ; i++) {
			
			temp = a[i];
			j = i ;
			
			while(j > 0  &&   a[j-1] > temp) {
				
				a[j]  = a[j-1];
				j = j-1;	
			}
			
			a[j] = temp;	
		}
		for(int x = 0 ; x < a.length ; x++) {
			System.out.print(a[x]+ ", ");
		}
	}

}
