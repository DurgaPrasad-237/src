package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int num = input.nextInt();
		int sum = 0;
		for(int i = 2; i<=num; i++ ) {
			if(num%i == 0)
				sum++;
		}
		if(sum >=2) {
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println("prime number");
		}
		
	}
	

}
