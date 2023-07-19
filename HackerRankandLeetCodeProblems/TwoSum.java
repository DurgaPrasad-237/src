package HackerRankandLeetCodeProblems;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		int num[] = new int[size];
		System.out.println("enter the elements");
		for(int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
		}
		System.out.println("enter the target");
		int target = input.nextInt();
		System.out.println(Arrays.toString(array(num,target)));
		
		
	}
	public static int[] array(int[] num, int target) {
		int[] result = new int[2];
		for(int i = 0; i<num.length; i++) {
			for(int j = i+1; j<num.length; j++) {
				if(num[i]+num[j] == target) {
				result[0] = i;
				result[1] = j;
				}
			}	
		}
		return result;
		
	}
}
