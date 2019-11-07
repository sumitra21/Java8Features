package come.java.ds.string;

import java.util.HashSet;
import java.util.Set;

public class CountNoOfPalindromeInStr {

	public static void main(String[] args) {
		String str = "aabaabbbaba";
		int n = str.length();
		
		int size = getThePalindromeCount(str,n);
		System.out.println(size);
		

	}

	private static int getThePalindromeCount(String str, int n) {
		Set<Integer> set = new HashSet<Integer>();
		
		String string = null;
		String revStr = null;
		for(int i = 0; i < n;i++) {
			for(int j = i+1; j < n; j++) {
				string = str.substring(i, j);
				System.out.println(string);
				revStr = reverse(string);
			}
		}
		
		
		
		
		
		return set.size();
	}

	private static String reverse(String string) {
		String result = null;
		for(int i = string.length(); i > 0; i--) {
			result = result.concat(string.charAt(i)+"");
		}
		System.out.println("Reversed :: "+result);
		return result;
	}

}
