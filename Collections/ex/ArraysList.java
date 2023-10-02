package Collections.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> obj = new ArrayList();
		System.out.println("enter the elements");
		for(int i = 0; i<10; i++) {
			obj.add(input.nextInt());
		}
		System.out.println(obj);

	}

}
