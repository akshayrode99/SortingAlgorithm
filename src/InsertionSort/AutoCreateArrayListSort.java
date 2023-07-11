package InsertionSort;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AutoCreateArrayListSort {
		
		public void sort() {
			Scanner sc = new Scanner(System.in);
			System.out.println("How many integer you want in ArrayList");
			int num = sc.nextInt();

			Random random = new Random();
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int n =1; n <= num; n++) {
				int x = random.nextInt(500000);
				list.add(x);
			}	

			System.out.println(list);

			int size = list.size();
			int min =list.get(0);
			
			System.out.println("Sort Start Time : " + LocalDateTime.now());

			for(int i = 0 ; i<size ; i++) {

				min = list.get(i);
				System.out.println("i = " + i + " value = " + min);

				for(int j = i+1 ; j<size ; j++) {

					if(min>list.get(j)) {
						 
						int	temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);

						min = list.get(i);
					}				
				}
			}
			System.out.println("\nsort End  Time : " + LocalDateTime.now());

			for(int q = 0 ; q < size ; q++) {
				System.out.print(list.get(q)+", ");
			}		
		}

		public static void main(String[] args) {
		 	AutoCreateArrayListSort obj = new AutoCreateArrayListSort();
			obj.sort();
	}
}
