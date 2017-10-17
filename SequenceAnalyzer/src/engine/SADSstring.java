package engine;

/* Generates a string of 1s and 0s based on two rules, a starting string, and some length
*  Example: rule 1 = 1 -> 10 and 0 -> 01, start 1, 3 times
*  Result: 1101001
*/

abstract public class SADSstring 
{
	public static String Generate1(String rule1, String rule2, String startingString, int length)
	{
		String strFinal = startingString;
	
		for (int i = 0; i < length; i++) 
		{	
			if(strFinal.charAt(i) == '1')
			{				
				strFinal += rule1;
			}
			else 
			{
				strFinal += rule2;
			}
		}
		return strFinal;
	}
}  
