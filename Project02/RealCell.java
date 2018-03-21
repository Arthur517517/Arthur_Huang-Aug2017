public abstract class RealCell implements Cell{
	private String entry;
	public RealCell(String entry) {
		this.entry = entry;
	}
	
	public abstract double getDoubleValue();
	
	
	public String abbreviatedCellText() {
		
	}
	
	public String fullCellText() {
		String result = entry;
		String a;
		String c;
		if(entry.contains("%")) {
			StringBuilder percent = new StringBuilder(entry);
			percent.deleteCharAt(entry.length()-1);
			a = percent.toString();
			double decimalPercent = Double.parseDouble(result);
			c = (decimalPercent * 0.01) +"";
		}
		return result;
	}
}
