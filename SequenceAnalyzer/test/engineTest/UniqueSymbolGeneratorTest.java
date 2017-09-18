package engineTest;

import static org.junit.Assert.*;
import org.junit.Test;
import engine.UniqueSymbolGenerator;

public class UniqueSymbolGeneratorTest {

	@Test
	public void SymbolGeneratorTester() {
		UniqueSymbolGenerator tester = new UniqueSymbolGenerator();
		
		for (int i=1;i<=5;i++) {
			tester.Generate();
			assertEquals("Testing symbol generator: ","_Var"+i,tester.SymbolGen());
			
		}
		
	}
	
}
