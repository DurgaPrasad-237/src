package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.println("enter the size of the array");
	        int size = input.nextInt();
	        int[] arr = new int[size];
	        System.out.println("enter the elements");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = input.nextInt();
	        }
	        System.out.println("which number you want to check");
	        int target = input.nextInt();
	        System.out.println(rN(arr,target));

	}
	public static String rN(int arr[],int target) {
		if(arr.length == 1) {
			return "no duplicate";
		}
		else if(arr.length == 2) {
			if(arr[0] == arr[1]) {
				return "duplicate";
			}
			else {
				return "no duplicate";
			}
		}
		else {
			int start = arr[0];
			int end = arr.length-1;
			while(start<end) {
				int mid = (start+end)/2;
				if(arr[mid] == target && arr[mid+1] == target) {
					return "duplicate";
				}
				else if(arr[mid]<target) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return "no duplicate";
			
		}
	}

}
