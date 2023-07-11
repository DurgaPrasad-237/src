package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Insert_Position {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		System.out.println("enter the target");
		int target = input.nextInt();
		System.out.println(array(num,target));
	}
	public static int array(int[] num, int target) {
		int start=0;
		int end = num.length-1;
		int  mid;
		while(start<=end) {
			 mid = start+(end-start)/2;
			if(num[mid]<target) {
				start = mid+1;
			}
			else if(num[mid]>target) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return start;	
	}
}
