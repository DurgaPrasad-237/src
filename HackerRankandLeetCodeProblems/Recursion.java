package hackerRankandLeetCodeProblems;

public class Recursion {

	    // Function to find the transition index
	    public static int findTransitionIndex(int[] bitArray, int low, int high) {
	       if(low == high) {
	    	   return low;
	       }
	       else {
	    	   int mid = (low+high)/2;
	    	   if(bitArray[mid] == 0 && bitArray[mid+1] == 1) {
	    		   return mid+1;
	    	   }
	    	   if(bitArray[mid] == 1 && bitArray[mid-1] == 0) {
	    		   return mid;
	    	   }
	    	   if(bitArray[mid] == 0) {
	    		   return findTransitionIndex(bitArray, mid+1, high);
	    	   }
	    	   else {
	    		   return findTransitionIndex(bitArray, low, mid+1);
	    	   }
	       }
	    }

	    public static void main(String[] args) {
	        int[] bitArray = {0,0,0,1,1,1}; // Example bit-array
	        int n = bitArray.length;

	        System.out.println(findTransitionIndex(bitArray,1,n-1));
	    }
	}

