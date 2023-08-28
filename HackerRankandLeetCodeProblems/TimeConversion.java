package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the time in this format HH:MM:SS AM or PM");
	String time = in.next();
	System.out.println(converison(time));
	}
	public static String converison(String s) {
		char check = s.charAt(8);
		int time1;
		String time2;
		String time = s.substring(0, 2);
		if(check == 'P') {
			if(time.equals("12")) {
				return s.substring(0, s.length()-2);
			}
			else {
			time1 = Integer.parseInt(time);
			time1 = time1+12;
			time2 = String.valueOf(time1);
			for(int i = 0; i<2; i++) {
			s = s.replaceFirst(time, time2);
			}
			return s.substring(0, s.length()-2);
			}
		}
		else if(check == 'A'){
			if(time.equals("12")) {
				for(int i = 0; i<2; i++) {
					s = s.replaceFirst(time, "00");
				}
				return s.substring(0, s.length()-2);
			}
		}
		return s.substring(0, s.length()-2);
	}
}
