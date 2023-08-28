package hackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PluseOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int digits[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0;i< digits.length; i++) {
			digits[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(pluseone(digits)));	
	}
	public static int[] pluseone(int[] digits) {
		  for (int i = digits.length - 1; i >= 0; i--) {
			  System.out.println(i);
	            if (digits[i] != 9) {
	                digits[i]++;
	                break;
	            } else {
	                digits[i] = 0;
	            }
	        }
	        if (digits[0] == 0) {
	            int[] rst = new int[digits.length + 1];
	            rst[0] = 1;
	            return rst;
	        }
	        return digits;
	}
}
