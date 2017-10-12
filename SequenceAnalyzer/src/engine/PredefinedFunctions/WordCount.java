package engine.PredefinedFunctions;

import java.util.*;

/*  Word Count Example (How many times a sub word appears with some length)
*
*   Word = 101101
*   sub word length = 3
*   Output = {011=1, 110=1, 101=2}
*/

public class WordCount
{
  public Map<String, Integer> wordCount(String word, int subWordLength) 
  {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String subWord = "";
		int newStartingIndex = 0;
		int newEndingIndex = subWordLength;
		
        //Goes through the word and finds each subword starting at the beginning index 
        //and ending at the subWordLength, then realigns the indices for the next subwords
		for (int i = 0; i < word.length(); i++)
		{
			subWord = word.substring(newStartingIndex, newEndingIndex);
			newStartingIndex++;
			newEndingIndex = newStartingIndex + subWordLength;
			
                        //if the map doesn't contain this subword then add it to the map,
                        //if it does, replace the previous one that was added and increment each time it gets added
			if (!map.containsKey(subWord))
			{
				map.put(subWord, 1);
			}
			else
			{
				map.replace(subWord, map.get(subWord) + 1);
			}
			
                        //if the ending index gets higher than the word length, all of the subwords have been found
			if (newEndingIndex > word.length())
			{
				break;
			}
		}
		
		return map;
	}
}  
