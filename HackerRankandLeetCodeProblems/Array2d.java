package HackerRankandLeetCodeProblems;
import java.util.Scanner;
public class Array2d {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("how many rows you want");
	int row = input.nextInt();
	System.out.println("how many columns you want");
	int column = input.nextInt();
	int[][] arr = new int[row][column];
	for(int i = 0; i<row; i++) {
		System.out.println("enter the "+i+" row");
		for(int j = 0; j<column; j++) {
			arr[i][j] = input.nextInt();
		}
	}
	for(int i = 0; i<row; i++) {
		for(int j = 0; j<column; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}
}
