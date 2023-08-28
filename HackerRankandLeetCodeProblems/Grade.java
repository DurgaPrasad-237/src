package hackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("number of students");
		int size = input.nextInt();
		for(int i = 0; i<size; i++) {
			arr.add(input.nextInt());
		}
		
		for(int i = 0; i<gradingstudents(arr).size(); i++) {
			System.out.println(gradingstudents(arr).get(i));
		}
	}
	public static List<Integer> gradingstudents(List<Integer> grades){
		List<Integer> s = new ArrayList<Integer>();
		for(int i = 0; i<grades.size(); i++) {
			if(grades.get(i)%5 == 0 || grades.get(i)<35) {
				s.add(grades.get(i));
			}
			else {
				int x = grades.get(i)/5;
				x = x+1;
				x = x*5;
				int y = x - grades.get(i);
				if(y<3) {
					s.add(x);
				}
				else {
					s.add(grades.get(i));
				}
			}
		}
		return s;
	}

}
