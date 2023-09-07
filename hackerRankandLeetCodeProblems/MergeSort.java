package hackerRankandLeetCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {11,13,12};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    	
    }
    public static void mergeSort(int array[]) {
    	if(array.length == 1) {
    		return;
    	}
    	int mid = array.length/2;
    	int left[] = new int[mid];
    	int right[] = new int[array.length-mid];
    	int j = 0;
    	for(int i = 0; i<array.length; i++) {
    		if(i<mid) {
    		left[i] = array[i];
    		}else {
    			right[j] = array[i];
    			j++;
    		}		
    	}
    	mergeSort(left);
    	mergeSort(right);
    	
    	merge(array,left,right);
    	
    }
    public static void merge(int array[], int left[], int right[]) {
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	int ls = left.length;
    	int rs = right.length;
 
    	while (i < ls && j < rs) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < ls) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < rs) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}

