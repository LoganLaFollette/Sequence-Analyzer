package engineTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.UniqueSymbolGenerator;

public class UniqueSymbolGeneratorTest {

	@Test
	public void SymbolGeneratorTester() {
		UniqueSymbolGenerator tester = new UniqueSymbolGenerator();
		
		for (int i=0;i<5;i++) {
			
			assertEquals("Testing symbol generator: ","_"+i,tester.SymbolGenerator());
			
		}
		
	}
	
}
