package InsertionSort;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGenerator {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want in array?");
		int n = s.nextInt();
		
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i =1; i <= n; i++) {
			int x = random.nextInt(500);
			list.add(x);
		}
		
		System.out.println(list);
		int y = list.size();
		System.out.println(y);

	}
}
