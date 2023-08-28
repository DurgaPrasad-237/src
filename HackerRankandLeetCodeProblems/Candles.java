package hackerRankandLeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<100000; i++) {
			arr.add(input.nextInt());
		}
		System.out.println(birthdayCakeCandles(arr));
	}
	public static int birthdayCakeCandles(List<Integer> arr ) {
		int maximum = Integer.MIN_VALUE;

	 
	    for (Integer candle : arr) {
	      if (candle >= maximum)
	        maximum = candle;
	    }

	
	    int result = 0;
	    for (Integer candle : arr) {
	      if (candle == maximum)
	        result++;
	    }

	    return result;	
	}
}

