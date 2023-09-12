package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class GCDandHCF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number 1");
		int num1 = input.nextInt();
		System.out.println("enter the number 2");
		int num2 = input.nextInt();
		int min = (num1>num2)?num2:num1;
		int gcd = 0;
		for(int i = 1; i<=min ; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		int lcm = (num1*num2)/gcd;
		System.out.println("LCM :"+lcm+"\n"+"GCD :"+gcd);

	}

}
