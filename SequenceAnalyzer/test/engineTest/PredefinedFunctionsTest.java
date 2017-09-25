package engineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import engine.PredefinedFunctions;

public class PredefinedFunctionsTest {

	@Test
	public void test() {
		
		PredefinedFunctions tester = new PredefinedFunctions();
		
		int[] calcCuttingX = tester.cuttingTimes("1011011");
		int[] actualCuttingX = new int[]{1,2,4,5,7};

		assertArrayEquals(calcCuttingX, actualCuttingX);
	
	}

}
