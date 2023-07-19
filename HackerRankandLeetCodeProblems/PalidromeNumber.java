package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int number = input.nextInt();
		System.out.println(palidrome(number));

	}
	public static boolean palidrome(int number) {
		int remainder,sum = 0;
		int temp = number;
		while(number>0) {
			remainder = number%10;
			sum = (sum*10)+remainder;
			number = number/10;
		}
		return (temp == sum)?true:false;	
	}	
}
