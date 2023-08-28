package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class MaxMinrecusrion {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = input.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println();
		
	Result result = dac(arr,0,arr.length-1);
		System.out.println("maximum "+result.max);
		System.out.println("minimum "+result.min);
	}
	public static Result dac(int arr[],int start, int end) {
		int maximum = arr[0];
		int minimum = arr[0];
		int max1,max2 = 0;
		int min1,min2 = 0;
		if(start == end) {
				maximum = arr[start];
				minimum = arr[start];
			return new Result(maximum, minimum);
			
			}
		
		if(start == end-1) {
			if(arr[start]>arr[end]) {
				maximum = arr[start];
				minimum = arr[end];
			}
			else {
				maximum = arr[end];
				minimum = arr[start];
			}
			return new Result(maximum, minimum);
		
		}
		
		
		
		else {
			int mid = start+end/2;
			Result l = dac(arr,start,mid);
			Result r = dac(arr,mid+1,arr.length-1);
			int max = Math.max(l.max, r.max);
			int min = Math.min(l.min, r.min);
			
			return new Result(max,min);
		
		}
	}
	static class Result{
		int max;
		int min;
		Result(int max, int min){
			this.max = max;
			this.min = min;
		}
	}
}