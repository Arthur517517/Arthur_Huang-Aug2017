public class PercentCell extends RealCell{
	private String entry;
	public PercentCell(String entry){
		super(entry);
	}
	
	public String abbreviatedCellText() {
		String abbr = super.getRealCell().substring(0, super.getRealCell().indexOf('.')) + "%";
		abbr = super.fillSpaces(abbr);
		return abbr;
	}
	
	public String fullCellText() {
		return (getDoubleValue() * 0.01) + "";
	}
	
	public double getDoubleValue() {
		String percent = super.getRealCell().substring(0, super.getRealCell().length()-1);
		double doubPercent = Double.parseDouble(percent);
		return doubPercent;
	}
		
}
