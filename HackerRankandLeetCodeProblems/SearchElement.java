package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(bs(arr,0,arr.length-1,9));
	}
	public static int bs(int arr[], int start, int end, int target) {
		if(start == end) {
			if(arr[start] == target) {
				return start;
			}
			else {
				return -1;
			}
		}
		else {
			int mid = (start+end)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else {
				if(target<arr[mid]) {
					return bs(arr,start,mid-1,9);
				}
				else {
					return bs(arr,mid+1,arr.length-1,9);
				}
			}
		}
		
	}

}
