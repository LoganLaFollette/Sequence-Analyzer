package engine;

public class PredefinedFunctions {

	/**
	 * Takes a string and determines whether it is shift maximal or not
	 * 
	 * @param s - the original string, from which all substrings will be generated
	 * @return
	 */
	public Boolean shiftMaximal(String s) {
		//check whether the string is valid here??
			//helper function
		//
		
		s.trim(); 
		int subIndex = 1;
		
		for (int i=0; i<s.length(); i++) {
			
			String subS = s.substring(subIndex);
			//find first disagreement, keeping track of the number of 1's
			//encountered before the disagreement for both strings
			
			//TODO: find a way to keep track of the 1's we have already counted
			int sCounter = 0;
			int subDisagreement = 0;
			// int subCounter = 0;
			
			for (int j=0; j<s.length()-subIndex; j++) {
				int sCompare = Character.getNumericValue(s.charAt(j));
				int subCompare = Character.getNumericValue(subS.charAt(j));
				//if (subCompare ==1) subCounter++;
				
				if (sCompare != subCompare) {
					subDisagreement = subCompare;
					break;
				}
				
				if (sCompare == 1) sCounter++;
			}
			
			//if number of 1's is even then 1>*>0
			if ((sCounter & 1) == 0) {
				if (subDisagreement == 1) return false;
			}
			else {
				if (subDisagreement == 0) return false;	
			}
			subIndex++;
		}	
		
		return true;
		
	}
}
