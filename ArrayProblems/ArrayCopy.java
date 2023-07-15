package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		copy(num);
	}
	public static void copy(int arr[]) {
		int arr2[] = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
