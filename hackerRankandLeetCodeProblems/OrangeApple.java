package hackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrangeApple {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the starting point of the house");
	int startpoint = input.nextInt();
	System.out.println("enter the ending point of the house");
	int endpoint = input.nextInt();
	System.out.println("enter the apple tree point");
	int applepoint = input.nextInt();
	System.out.println("orange tree point");
	int orangepoint = input.nextInt();
	System.out.println("how many apples fell down");
	int applefell = input.nextInt();
	System.out.println("how many oragne fell down");
	int orangefell = input.nextInt();
	List<Integer> apple = new ArrayList();
	System.out.println("disantce of apples fall from point a");
	for(int i = 0; i<applefell; i++) {
		apple.add(input.nextInt());
	}
	List<Integer> orange = new ArrayList();
	System.out.println("disantce of apples fall from point a");
	for(int i = 0; i<orangefell; i++) {
		orange.add(input.nextInt());
	}
	countappleandoranges(startpoint,endpoint,applepoint,orangepoint,apple,orange);

	}
	public static void countappleandoranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		int[] app = new int[apples.size()];
		int[] org = new int[oranges.size()];
		int noOfApples = 0;
		int noOfOranges = 0;
		for(int i = 0; i<apples.size(); i++) {
		app[i] = apples.get(i)+a;
		if(app[i]>=s && app[i]<=t) {
			noOfApples++;
		}
		}
		for(int i = 0; i<oranges.size(); i++) {
			org[i] = oranges.get(i)+b;
			if(org[i]>=s && org[i]<=t) {
				noOfOranges++;
			}
		}
		System.out.println(noOfApples +"\n"+noOfOranges );
	}

}
