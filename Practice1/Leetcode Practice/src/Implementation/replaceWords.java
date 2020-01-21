
/*
 * In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:

Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
 

Note:

The input will only have lower-case letters.
1 <= dict words number <= 1000
1 <= sentence words number <= 1000
1 <= root length <= 100
1 <= sentence words length <= 1000

 */
package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class replaceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "the cattle was rattled by the battery";
		List<String> dict = new ArrayList<String>();
		dict.add("rat");
		dict.add("cat");
		
		replace(dict, sentence);
	}

	private static String replace(List<String> dict, String sentence) {
		// TODO Auto-generated method stub
		
		Collections.sort(dict);
		
		String[] words = sentence.split(" ");
		String newStr = "";
		
		for(String s : dict) {
			for(int i=0; i<words.length; i++) {
			if(words[i].startsWith(s)) words[i]  = s;
			}
		}
		for(int i=0;i<words.length; i++){
			if(i==(words.length-1)) newStr +=  words[i];
			else
			newStr +=  words[i] + " ";
		}
		
		System.out.println(newStr);
		return newStr;
	}

}
