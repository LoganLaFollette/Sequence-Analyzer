package engineTest.PredefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.PredefinedFunctions.CuttingTimes;

public class CuttingTimesTest {

	@Test
	public void test() {
		
		CuttingTimes tester = new CuttingTimes();
		
		int[] calcCuttingX = tester.cuttingTimes("1011011");
		int[] actualCuttingX = new int[]{1,2,4,5,7};

		assertArrayEquals(calcCuttingX, actualCuttingX);
	
	}

}
