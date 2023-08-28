package hackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PM {

	public static void main(String[] args) {
		System.out.println((float)3/6);
		Scanner input = new Scanner(System.in);
		System.out.println("how many elements you want elements");
		int ele = input.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i<ele; i++) {
			arr.add(input.nextInt());
		}
		plusMinus(arr);

	}
	public static void plusMinus(List<Integer> arr) {
		int p = 0, n = 0, z = 0;
		for(int i = 0; i<arr.size(); i++) {
			if(arr.get(i) < 0) {
				n++;
			}
			else if(arr.get(i)>0) {
				p++;
			}
			else {
				z++;
			}
		}
		System.out.println((float)p/arr.size()+"\n"+(float)n/arr.size()+"\n"+(float)z/arr.size());
	}
}
