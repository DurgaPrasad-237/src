package hackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		System.out.println("enter the elements in list a");
		for(int i = 0; i<3; i++) {
			a.add(input.nextInt());
		}
		System.out.println("enter the elements in list a");
		for(int i = 0; i<3; i++) {
			b.add(input.nextInt());
		}
		System.out.println(cT(a,b));

	}
	public static List<Integer> cT(List<Integer> a, List<Integer> b){
		List<Integer> win = new ArrayList<>();
		int x = 0,y = 0; 
		for(int i = 0; i<3; i++) {	
			if(a.get(i) > b.get(i)) {
				x++;
			}
			else if(a.get(i) < b.get(i)) {
				y++;
			}
		}
		win.add(x);
		win.add(y);
		
		return win;
	}

}
