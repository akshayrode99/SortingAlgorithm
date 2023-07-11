package BubbleSortAlgorithm;

public class BubbleSortAlgo {
	public static void main(String[] args) {
		
		int a[] = {36 , 19 , 29 , 12 , 5};
		
		int size = a.length;
		int temp ; 
		
		for(int i = 0 ; i < size ; i++) {
			
			for(int j = 0 ; j < size-1 ; j++ ) {
				
				if(a[j] > a[j+1]) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp ; 
				}				
			}			
		}	
		for(int z = 0 ; z < size ; z++) {
			System.out.print(a[z]+ ", ");
		}
	}
}

