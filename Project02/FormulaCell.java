
	public class FormulaCell extends RealCell{
	public FormulaCell(String entry) {
		super(entry);
	}
	
	public String abbreviatedCellText() {
		String finalString = getDoubleValue() + "";
		return fillSpaces(finalString);
	}

	public String fullCellText() {
		return super.getRealCell();
	}
	
	public double getDoubleValue() {
		String modified = getRealCell().substring(2, getRealCell().length()-2);
		String[] arr = modified.split(" ");
		
	}
}

