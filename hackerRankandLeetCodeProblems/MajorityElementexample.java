package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class MajorityElementexample {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.println("enter the size of the array");
	        int size = input.nextInt();
	        int[] arr = new int[size];
	        System.out.println("enter the elements");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = input.nextInt();
	        }
	        System.out.println("enter the target");
	        int target = input.nextInt();
	        System.out.println(majorele(arr,target));

	}
	public static boolean majorele(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			if(arr[start] != target && arr[end] != target) {
				start++;
				end--;
			}
			else if(arr[start] != target && arr[end] == target) {
				start++;
			}
			else if(arr[start] == target && arr[end] != target) {
				end--;
			}
			else {
				break;
			}
		}
		if(arr.length/2 < (end-start+1)) {
			return true;
		}
		else {
			return false;
		}
	}

}
