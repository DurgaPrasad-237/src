package HackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("size of the array");
		int size = input.nextInt();
		System.out.println("how many elements do you want to insert");
		int m = input.nextInt();
		int[] nums1 = new int[size];
		System.out.println("enter  the elemetns");
		for(int i = 0; i<m; i++) {
			nums1[i] = input.nextInt();
		}
		int n = nums1.length-m;
		int nums2[] = new int[n];
		
		if(nums2.length != 0) {
		System.out.println("enter the elements to the second array");
		for(int i = 0; i<nums2.length;i++) {
			nums2[i] = input.nextInt();
		}
		}
		
		merge(nums1,m,nums2,n);
		
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		while(k>=0) {
			if(i>=0 && j>=0) {
				if(nums2[j]>nums1[i]) {
					nums1[k--] = nums2[j--]; 
				}
				else {
					nums1[k--] = nums1[i--];
				}
			}
			else if(j>=0) {
				nums1[k--] = nums2[j--];
			}
			else {
				break;
			}
		}
		System.out.println(Arrays.toString(nums1));

	}
}
			

	

