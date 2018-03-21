public class PercentCell extends RealCell{
	private String entry;
	public PercentCell(String entry){
		super(entry);
	}
	
	public String fullCellText() {
		String result = entry;
		String a;
		String c;
		
		
		StringBuilder percent = new StringBuilder(entry);
		percent.deleteCharAt(entry.length()-1);
		a = percent.toString();
		double decimalPercent = Double.parseDouble(result);
		c = (decimalPercent * 0.01) +"";
		
		return c;
	}
		
}
