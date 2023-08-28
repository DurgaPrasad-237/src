package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many rows you want");
		int row = input.nextInt();
		System.out.println("how many columns you want");
		int column = input.nextInt();
		int[][] arr = new int[row][column];
		int[][] arr1 = new int[row][column];
		for(int i = 0; i<row; i++) {
			System.out.println("enter the first matrix "+i+" row");
			for(int j = 0; j<column; j++) {
				arr[i][j] = input.nextInt();
			}
			System.out.println("enter the second matrix "+i+" row");
			for(int k = 0; k<column; k++) {
				arr1[i][k] = input.nextInt();
			}
		}
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++) {
				System.out.print(arr[i][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
