package engineTest.PredefinedFunctionsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.CONSTS;
import engine.PredefinedFunctions.ShiftMaximality;

public class ShiftMaximalityTest {

	@Test
	public void ShiftMaximalTester() {
		ShiftMaximality tester = new ShiftMaximality();
		
		//shift maximal = true
		assertEquals(tester.shiftMaximal("101110101011101*"), CONSTS.SUCCESS);
		
		//shift maximal = false
		assertEquals(tester.shiftMaximal("101001*"), CONSTS.FAILURE);
	}

}
