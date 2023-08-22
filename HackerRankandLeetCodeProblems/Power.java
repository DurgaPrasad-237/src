package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number");
	int num = input.nextInt();
	System.out.println("enter the power");
	int power = input.nextInt();
	System.out.println(dacPow(num,power));
	}
	public static int dacPow(int num, int power) {
		if(power == 1) {
			return num;
		}
		else {
			int mid = power/2;
			int b = dacPow(num,mid);
			int c = b*b;
			if(power%2 == 0) {
			return c;
			}
			else {
				return num*c;
			}
		}
	}

}
