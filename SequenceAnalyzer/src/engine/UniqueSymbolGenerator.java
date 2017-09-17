package engine;

public class UniqueSymbolGenerator {
	int symbolNum = 0;
	
	public String SymbolGenerator() {
		String symbol = "_" + symbolNum;
		symbolNum++;
		return symbol;
	}
	
}
