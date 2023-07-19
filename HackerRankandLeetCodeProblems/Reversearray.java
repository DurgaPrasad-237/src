package HackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(reverseArray(num)));

	}
	public static int[] reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		int temp = 0;
		while(i<j) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;			
		}
		return arr;		
		}	
	}

