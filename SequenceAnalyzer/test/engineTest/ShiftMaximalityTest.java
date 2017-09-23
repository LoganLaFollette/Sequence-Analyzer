package engineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import engine.ShiftMaximality;

public class ShiftMaximalityTest {

	@Test
	public void ShiftMaximalTester() {
		ShiftMaximality tester = new ShiftMaximality();
		
		assertTrue("Testing shift maximality: ",tester.shiftMaximal("101110101011101*"));
		assertFalse("Testing shift maximality: ",tester.shiftMaximal("101001*"));
	}

}
