package all_ctci.arraysAndStrings;

/* Given two strings 
 * check if they are permutations of each other.
 * 
 * 
 * Brute force :
 * Sort the strings alphabetically and check for equality.
 * 
 * The below solution checks the frequency of each character. 
 * ( Assuming it to be an ASCII String )
 */

// SOLUTION :
import java.util.*;
public class checkPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		
		boolean flag = true;
		
		int [] ans = new int[128];
		for(int i=0; i<a.length(); i++) {
			int pos = (int) a.charAt(i);
			ans[pos]++;	
			
		}
		
		for(int i = 0 ; i<b.length(); i++) {
			int pos = (int) b.charAt(i);
			ans[pos]--;
			if(ans[pos] < 0)
				flag = false;
		}
		
		if(flag)
			System.out.println("Yes they are permutations of each other");
		else
			System.out.println("No they are not permutations");

	}

}
