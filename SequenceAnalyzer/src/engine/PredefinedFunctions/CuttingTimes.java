package engine.PredefinedFunctions;

import java.util.ArrayList;
import java.util.List;

public class CuttingTimes {
	
	
	/**
	 * This method iterates through a string to find a list of all cutting times 
	 * (where digits in the same position are different) This method will only be
	 * invoked on strings that are shift maximal. Here the first number of a string
	 * is position 1 - not position 0.
	 * 
	 * @param s - the shift maximal string whose cutting times are to be calculated
	 * @return List<Integer> cuttingX - the list containing all cutting times
	 */
	public int[] cuttingTimes(String s) {
		
		List<Integer> cuttingList = new ArrayList<Integer>();	
		
		//1,2 are always considered cutting times
		//Note: 1,2 correspond to s.charAt(0) and s.charAt(1)
		cuttingList.add(1);
		cuttingList.add(2);
		
		//take off the first two digits and compare with original
		String cutString = s.substring(2);
		
		for (int i = 0; i<cutString.length(); i++) {
			if (s.charAt(i) != cutString.charAt(i)) cuttingList.add(i+3);
		}
		
		int[] cuttingTimes = cuttingList.stream().mapToInt(i->i).toArray();
		
		return cuttingTimes;
		
	}

}
