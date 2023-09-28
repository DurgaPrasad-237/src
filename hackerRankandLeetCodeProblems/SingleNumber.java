package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class SingleNumber {
	public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   System.out.println("enter the size");
		   int size = input.nextInt();
		   int[] arr = new int[size];
		   System.out.println("enter the numbers");
		   for(int i = 0; i<arr.length; i++) {
			   arr[i] = input.nextInt();
		   }
		   System.out.println(sN(arr));
		   
	}
	public static int sN(int nums[]) {
		int x = 0;
	for(int i = 0; i<nums.length; i++) {
		 x = nums[i];
		int sum = 0;
		for(int j = i+1; j<nums.length; j++) {
			if(nums[i] == nums[j] && nums[i] != -1) {
				sum++;
				nums[j] = -1;
			}
		}
		if(sum == 0 && nums[i] != -1) {
			break;
		}
	}
	return x;
	
	}
	

}
