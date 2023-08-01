package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("enter the nubmer");
		int num = input.nextInt();
		System.out.println(5^2);
		checkamstrong(num);
	}
	public  static void checkamstrong(int num) {
		int len = String.valueOf(num).length();
		int temp = num;
		int rem;
		int sum = 0;
		while(num>0) {
			rem = num%10;
			sum = (int) (sum+(Math.pow(rem, len)));
			num = num/10;
		}
		if(temp == sum)
			System.out.println("it is Amstrong");
		else
			System.out.println("not amstrong");
		
	}

}
