package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		   System.out.println("enter the size");
		   int size = input.nextInt();
		   int[] arr = new int[size];
		   System.out.println("enter the numbers");
		   for(int i = 0; i<arr.length; i++) {
			   arr[i] = input.nextInt();
		   }
		   System.out.println(dN(arr));
	}
	public static boolean dN(int nums[]) {
		boolean result = false;
		for(int i = 0; i<nums.length; i++) {
			int sum = 1;
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					sum++;
					break;
				}
			}
			if(sum > 1) {
				result = true;
				break;
			}
		}
		return result;
		
	}

}
