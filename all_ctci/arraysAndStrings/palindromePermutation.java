package all_ctci.arraysAndStrings;

/*Given a string.
 * Check whether it is a permutation of a palindrome.
 */



//SOLUTION :
import java.util.*;
public class palindromePermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i<s.length(); i++) {
			if(!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), 1);
			}else
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
		}
		int count = 0;
		boolean flag = false;
		for (int  f : hm.values()) { 
			if(f == 1)
				count++;
			if(count > 1)
				break;
			if(f % 2 == 0) {
				flag = true;
			}else
				break;
				
		}
		
		if(count == 1 && flag)
			System.out.println("A palindrome Permutation");
		else if(flag)
			System.out.println("A palindrome Permutation");
		else
			System.out.println("Not a palindrome Permutation");
            
	}

}
