package HackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		int target = input.nextInt();
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		System.out.println((singleNumber(num,target)));
	}
	public static int singleNumber(int nums[], int value) {
		int x = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != value) {
				nums[x] = nums[i];
				x++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return x;
	}		
}


