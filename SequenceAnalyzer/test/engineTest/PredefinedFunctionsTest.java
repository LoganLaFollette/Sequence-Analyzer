package engineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import engine.PredefinedFunctions;

public class PredefinedFunctionsTest {

	@Test
	public void ShiftMaximalTester() {
		PredefinedFunctions tester = new PredefinedFunctions();
		
		assertFalse("Testing shift maximality: ",tester.shiftMaximal("10111010"));
	}

}
