package InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSort {
	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>(Arrays.asList(17,73,12,9,7,11,14,19,3,1,2));

		int min = list.get(0);
		int size = list.size();
		int temp ;

		for(int i = 0 ; i< list.size() ; i++) {

			min = list.get(i);

			for(int j = i+1 ; j<list.size() ; j++) {

				if(min>list.get(j)) {

					temp = list.get(i);					
					list.set(i, list.get(j));
					list.set(j, temp);
					
					
					min = list.get(i);
				}
			}
		}
		for(int w = 0 ; w<list.size(); w++) {
			System.out.print(list.get(w)+" ");
		}
	}
}
