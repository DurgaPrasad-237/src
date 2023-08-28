package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		evenodd(num);
	}
	public static void evenodd(int num) {
		if(num%2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
