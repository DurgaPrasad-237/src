package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class BinarySearch2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(bs2(arr,0,arr.length-1));

	}
	public static int bs2(int arr[], int start, int end) {
		if(start == end) {
			if(arr[start] == start) {
				return start;
			}
			else {
				return -1;
			}
		}
		else {
			int mid = (start+end)/2;
			if(arr[mid] == mid) {
				return mid;
			}
			else {
				if(mid < arr[mid]) {
					return bs2(arr,start,mid-1);
				}
				else {
					return bs2(arr,mid+1,arr.length-1);
				}
			}
		}
		
	}

}
