package engine.PredefinedFunctions;

import engine.CONSTS;

/*
*   Star Product Example
*
*   (Odd example)
*   s1 = 10101  (odd number of 1s)
*   s2 = 1001   (Flip each bit)
*   
*   sFinal = 101010101011101011101010 (Copies of each flipped character of s2 inbetween whole copies of s1)
*
*   (Even example)
*   s1 = 101101 (Even number of ones)
*   s2 = 00010  (Doesn't need to flip anything)
*
*   sFinal = 10110101011010101101010110111011010  (Copies of s2 inbetween whole copies of s1)
* 
 */

public class StarProduct
{
    
	
	public String starProduct(String star1, String star2)
	{		
		int counter = 0;
		String strFinal = "";
		
    		//Goes through star1 to make sure there aren't any inconsistencies (characters that are not "1" or "0")
    		//Also increases the counter for every "1"
		for (int i = 0; i < star1.length(); i++)
		{
			if (star1.charAt(i) == '1')
			{
				counter++;				
			}
			else if (star1.charAt(i) != '0')
			{
				return CONSTS.ERROR;
			}
		}
    		//Goes through star2 to make sure there aren't any inconsistencies
		for (int i = 0; i < star2.length(); i++)
		{
			if (star2.charAt(i) != '1' && star2.charAt(i) != '0')
			{
				return CONSTS.ERROR;
			}
		}
    
    		//if the counter is even, place each character of s2 inbetween copies of s1
		if (counter % 2 == 0)
		{
			for (int i = 0; i < star2.length(); i++)
			{
				char subStar2 = star2.charAt(i);
				strFinal += star1 + subStar2;
			}
		}
    		//if the counter is odd, "flip" each bit of s2 and place each flipped bit inbetween copies of s1
		else if (counter % 2 == 1)
		{
			for (int i = 0; i < star2.length(); i++)
			{
				char[] newStar2 = star2.toCharArray();
				if (star2.charAt(i) == '1')
				{
					newStar2[i] = '0';
					star2 = String.valueOf(newStar2);
				}
				else if (star2.charAt(i) == '0')
				{
					newStar2[i] = '1';
					star2 = String.valueOf(newStar2);
				}
				char subStar2 = star2.charAt(i);
				strFinal += star1 + subStar2;
			}
		}				
		return strFinal;		
	}
}  
