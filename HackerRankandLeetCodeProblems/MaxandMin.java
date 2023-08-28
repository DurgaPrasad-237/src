package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class MaxandMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		maxMin(num);
	}
	public static void maxMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}		
		}
		System.out.println("max :"+max+" min :"+min);
	}
}
