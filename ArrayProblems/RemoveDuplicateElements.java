package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		System.out.println(removeDuplicates(num));
	}
	public static int removeDuplicates(int nums[]) {
		int  k = 0;
		int p = 0;
		for(int i = 1; i<nums.length; i++) {
			if(nums[k] != nums[i]) {
				k++;
				nums[k] = nums[i];	
			}
		}
		return k+1;
		
		
		
	}
}
	


