package hackerRankandLeetCodeProblems;

import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
    	int count =0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the target");
        int target = input.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int x = majorele(arr, start, end, target);
        for(int i = x; i<arr.length; i++ ) {
        	if(arr[i] != target) {
        		break;
        	}
        	else {
        		count++;
        	}
        }
        if(count >arr.length/2) {
        	System.out.println("true");
        }
        else {
        System.out.println("false");
        }
    }

    public static int majorele(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target && arr[mid - 1] != target) {
                return mid;
            } else if (arr[mid] == target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
