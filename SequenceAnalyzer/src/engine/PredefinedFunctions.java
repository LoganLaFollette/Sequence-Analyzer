package engine;

public class PredefinedFunctions {

	/**
	 * Takes a string and determines whether it is shift maximal or not
	 * 
	 * @param s - the original string, from which all substrings will be generated
	 * @return boolean true if shift maximal, false otherwise
	 */
	public Boolean shiftMaximal(String s) {

		s.trim(); 
		int subIndex = 1;
		
		for (int i=0; i<s.length(); i++) {
			
			String subS = s.substring(subIndex);
			//find first disagreement, keeping track of the number of 1's
			//encountered before the disagreement for the original string
			
			//TODO:maybe find a way to keep track of the 1's we have already counted
			int sCounter = 0;			
			for (int j=0; j<subS.length(); j++) {
				
				int sCompare = Character.getNumericValue(s.charAt(j));
				int subCompare = Character.getNumericValue(subS.charAt(j));
				
				//if there is a disagreement, store the value of the substring at the disagreement
				//and break the loop, otherwise increment otherwise increment the 1's counter
				if (sCompare != subCompare) {
					
					//if number of 1's is even then 1>*>0
					//if number of 1's is odd then 0<*<1
					//Note: we only care whether the substring is greater than the original 
					if ((sCounter & 1) == 0) {
						if (subCompare == 1) return false;
					}
					else {
						if (subCompare == 0) return false;	
					}
				}
				if (sCompare == 1) sCounter++;
			}
			subIndex++;
		}	
		
		return true;
		
	}
}
