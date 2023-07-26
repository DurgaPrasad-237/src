package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is the multiplication of :");
		int mul = input.nextInt();
		multiple(mul);
	}
	public static void multiple(int mul) {
		for(int i = 1; i<=10; i++) {
			System.out.println(mul+" * "+i+" = "+mul*i);
		}
	}
}
