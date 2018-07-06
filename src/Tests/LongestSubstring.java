package Tests;

/*
 * 
 * author :  DeepKanchan
 * 
 *  PS : Given a string, find the length of the longest substring 
 *  	 without repeating characters
 */
public class LongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	String str = "abcadefg";
	System.out.println( lengthOfLongestSubstring(str));
	
	System.out.println( lengthOfLongestSubstring("abcabd")); //4
	System.out.println( lengthOfLongestSubstring("aaaaaaaaaa")); //1
	System.out.println( lengthOfLongestSubstring("aaaaaaaaaabc")); //3
	System.out.println( lengthOfLongestSubstring("aaaaaaaaaabbbbb")); //2
	
	System.out.println( lengthOfLongestSubstring("abcdeamabcde")); //5
	}

	public static int lengthOfLongestSubstring(final String str) {
		String newstr = str.substring(0,1); //for longest substring
		int substrlen = 0;

		for(int i = 1; i < str.length(); i++) {
			if(newstr.contains(Character.toString(str.charAt(i)))) { //first duplicate char found
				if(substrlen < newstr.length()){
					substrlen = newstr.length();
				}
				int start = newstr.indexOf(str.charAt(i)); 
				newstr = newstr.substring(start+1,newstr.length()) + str.substring(i,i+1);
			} else {
				newstr = newstr + str.charAt(i);
        	    if(substrlen < newstr.length()){
        	    	substrlen = newstr.length();
        	    }
			}
         }
		return substrlen; 
    }
}
