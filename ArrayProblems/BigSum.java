package ArrayProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many elements you want elements");
		int ele = input.nextInt();
		List<Long> arr = new ArrayList<>();
		for(int i = 0; i<ele; i++) {
			arr.add((long)input.nextInt());
		}
		System.out.println(aVeryBigSum(arr));

	}
	  public static long aVeryBigSum(List<Long> ar) {
		long x = 0;
		  for(int i = 0; i<ar.size(); i++) {
			x = x+ar.get(i);
		  }
		  return x;
		   

	  }

}
