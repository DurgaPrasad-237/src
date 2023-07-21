package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		staircase(n);
	}
	public static void staircase(int n) {
		int k = n;
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<=n; j++) {
				if(j>=k) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			k--;
		}
	}

}
