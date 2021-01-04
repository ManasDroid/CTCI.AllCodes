package all_ctci.arraysAndStrings;


/* Q ) Check if a String has all unique characters.
 * 
 * This solution assumes that this is a ASCII string & not an Unicode string
 * Also the assumption is that all letters are a - z lowercase letters.
 * 
 * 
 * (THE BRUTE FORCE TO THIS CAN BE TO JUST USE TWO NESTED LOOPS
 * 		AND COMPARE EACH ELEMENT WITH EVERY OTHER ELEMENT
 * 					PRESENT IN THE STRING )
 * 
 */


// SOLUTION :

import java.util.*;
public class isUnique {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		
		if(isUnique(s))
			System.out.println("yes");
		else
			System.out.println("no");
		

	}
	
	
	static boolean isUnique(String s) {
		
		int checker = 0;
		for(int i = 0; i<s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if((checker & (1 << val) ) > 0) {
				return false;
			}
			
			checker = checker | (1 << val) ;
		}
		
		return true;
		
		
	}

}
