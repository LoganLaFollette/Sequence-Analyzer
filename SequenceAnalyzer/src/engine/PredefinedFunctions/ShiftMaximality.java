package engine.PredefinedFunctions;

import engine.CONSTS;
/**
 * @author Logan LaFollette
 * 
 * EXAMPLE WHERE SM is FALSE
 * INPUT = 101001* - here * denotes that the string is repeated infinitely afterwards
 * 
 * 	FIRST ITERATION
 * 		s =  101001*
 * 		s1 = 01001*
 * 	*First disagreement is at position one*
 * 	*There were 0 (even) number of 1's before the disagreement*
 * 	Here, 1>*>0 so s is larger than s1 -- continue iteration
 * 
 * 	SECOND ITERATION
 * 	s =  101001*
 * 	s2 = 1001*
 * 	*First disagreement is at position three*
 * 	*There was an odd number of 1's before the disagreement (odd)*
 * 	Here, 0<*<1 -- look at the disagreement position for comparison
 * 
 * ---------------------------------------------------------------------
 * 	since sDisagreement = 1 and subDisagreement = 0 and the sign is odd,
 * 	the substring is larger than the original string, and therefore the 
 * 	original string is not shift maximal. The original string must be 
 * 	greater than every single substring in the loop for shift maximality
 * 	to occur. Note: we are only checking the first disagreement in the two
 * 	strings, if there are no disagreements, the loop continues to the next
 * 	substring
 * ---------------------------------------------------------------------	
 *
 */
public class ShiftMaximality {

	/**
	 * Takes a string and determines whether it is shift maximal or not
	 * 
	 * @param s - the original string, from which all substrings will be generated
	 * @return int value 1 if shift maximal, 0 if undetermined, -1 if not shift maximal
	 */
	public int shiftMaximal(String s) {
		
		s.trim(); 
		
		//loop through all substrings of s
		for (int i=0; i<s.length(); i++) {
			
			//boolean to keep track of even or odd
			boolean even = true;
			
			String subS = s.substring(i+1);
			//find first disagreement, keeping track of the number of 1's
			//encountered before the disagreement for the original string
			
			//default set to n - no disagreement
			char sDisagreement = 'n';
			char subDisagreement = 'n';
		
			for (int j=0; j<subS.length(); j++) {
				
					char sCompare = s.charAt(j);
					char subCompare = subS.charAt(j);
					
					if (sCompare != subCompare) {
						subDisagreement = subCompare;
						sDisagreement = sCompare;
						break;
					}
					if (sCompare == '1') even = !even;
				}
				
				//if number of 1's is even then 1>*>0
				//if number of 1's is odd then 0>*>1
				//Note: we only care whether the substring is greater than the original
			if (subDisagreement != 'n') {
				
				if (even) {
					if (subDisagreement == '1' || subDisagreement == '*' && sDisagreement == '0') return CONSTS.FAILURE;
				}
				else {
					if (subDisagreement == '0' || subDisagreement == '*' && sDisagreement == '1') return CONSTS.FAILURE;
				}
			}
			else {
				//if there is no disagreement it can still be shift maximal if the 
				//rest of the substrings are less than the original, for infinite strings 
				//we return 0 if we are done processing and there was an even comparison
				
				//TODO: check if we have reached computation limit and return undetermined
				
				//return CONSTS.UNDETERMINED;
			}
			
		}	
		
		return CONSTS.SUCCESS;
		
	}
}
