package HackerRankandLeetCodeProblems;
public class Factorial {
	public static void main(String[] args) {
		System.out.println(xx(6));
	}
	public static int xx(int n) {
		int x;
		if(n<=1) {
			return 1;
		}
		else {
			return n*xx(n-1);
		}		
	}
}
