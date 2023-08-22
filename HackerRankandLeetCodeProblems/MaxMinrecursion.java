package HackerRankandLeetCodeProblems;

import java.util.Scanner;

public class MaxMinrecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println();

        Result result = dac(arr, 0, arr.length - 1);
        System.out.println("Maximum: " + result.maximum);
        System.out.println("Minimum: " + result.minimum);
    }

    static class Result {
        int maximum;
        int minimum;

        Result(int maximum, int minimum) {
            this.maximum = maximum;
            this.minimum = minimum;
        }
    }

    public static Result dac(int arr[], int start, int end) {
        if (start == end) {
            return new Result(arr[start], arr[start]);
        }

        if (start == end - 1) {
            if (arr[start] > arr[end]) {
                return new Result(arr[start], arr[end]);
            } else {
                return new Result(arr[end], arr[start]);
            }
        }

        int mid = (start + end) / 2;
        Result leftResult = dac(arr, start, mid);
        Result rightResult = dac(arr, mid + 1, end);

        int maximum = Math.max(leftResult.maximum, rightResult.maximum);
        int minimum = Math.min(leftResult.minimum, rightResult.minimum);

        return new Result(maximum, minimum);
    }
}
