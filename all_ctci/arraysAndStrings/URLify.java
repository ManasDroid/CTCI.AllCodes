package all_ctci.arraysAndStrings;


/* Write a program to replace all the spaces in the string with a "%20"
 * 
 * 
 * 
 * Example :
 * 	Input  > "Mr Manas Ranjan Patra"
 * 
 * 	Output > "Mr%20Manas%20Ranjan%20Patra"
 * 
 */
import java.util.*;
public class URLify {
	
	static int MAX = 1000;
	
	static char[]replaceSpaces( char[] str) {
		
		int spaces =0;
		int i=0;
		for(i=0; i<str.length; i++) {
			if(str[i] == ' ') {
				spaces++;
			}
		}
		
		while(str[i-1] == ' ') {
			spaces--;
			i--;
		}
		
		int length = i + spaces *2; //the actual formula is i + spaces * (n-1) ; here n = 3 since the length of "%20" is 3.
		
		if (length > MAX)
			return str;
		
		char[] old_str = str;
		
		str = new char[length];
		
		 int index = length- 1;
	        // Fill rest of the string from end
	        for (int j = i - 1; j >= 0; j--) 
	        {
	 
	            // inserts %20 in place of space
	            if (old_str[j] == ' ') 
	            {
	                str[index] = '0';
	                str[index - 1] = '2';
	                str[index - 2] = '%';
	                index = index - 3;
	            } 
	             
	            else
	            {
	                str[index] = old_str[j];
	                index--;
	            }
	        }
	        return str;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		char str[] = s.toCharArray();
		
		str = replaceSpaces(str);
		
		for(int i =0; i<str.length; i++ )
			System.out.print(str[i]);

	}

}
