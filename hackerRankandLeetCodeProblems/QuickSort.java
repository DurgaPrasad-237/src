package hackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.println("enter the size of the array");
	        int size = input.nextInt();
	        int[] arr = new int[size];
	        System.out.println("enter the elements");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = input.nextInt();
	        }
	        System.out.println(Arrays.toString(qs(arr,0,arr.length-1)));

	}
	public static int[] qs(int arr[], int left , int right) {
		if(left<right) {
		int	pi = partition(arr,left,right);
		qs(arr,left,pi-1);
		qs(arr,pi+1,right);
		}
		return arr;
	}
	public static int partition(int arr[], int left, int right) {
		int pivot = left;
		while(left<right) {
			if(arr[pivot]>arr[right]) {
			int temp = arr[right];
			arr[right] = arr[pivot];
			pivot = right;
			arr[left] = temp;
			}
			else if(arr[pivot]<arr[right]) {
				right--;
			}
			else if(arr[pivot]>arr[left]) {
				left++;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[pivot];
				arr[right] = temp;
				pivot = left;
			}
		}
		return pivot;
		
		
	}
	

}
