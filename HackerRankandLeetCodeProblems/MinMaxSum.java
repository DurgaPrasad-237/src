package HackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<5; i++) {
			arr.add(input.nextInt());
		}
		maxMinSum(arr);

	}
	public static void maxMinSum(List<Integer> arr) {
		long i;
		long s,l;
		long[] arr2 = new long[2];
		for(int k = 0; k<arr.size(); k++) {
			s = 0; l=0;
			for(i= 0; i<arr.size(); i++) {
				if(k!=i) {	
					s = s+arr.get((int) i);
					l = l+arr.get((int) i);		
				}		
			}
			if(arr2[0] == 0 || arr2[0]>=s) {
				arr2[0] = s;
			}
			if(arr2[1] == 0 || arr2[1]<=l) {
				arr2[1] = l;
			}		
		}	
		System.out.println(arr2[0]+" "+arr2[1]);
	}
	
	
}
