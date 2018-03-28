	public class ValueCell extends RealCell{
	public ValueCell(String entry) {
		super(entry);
	}
	public String abbreviatedCellText() {
		String txt = getDoubleValue() + "";
		if(txt.length() < 10) {
			return super.fillSpaces(txt);
		}else {	
			return txt.substring(0,10);
		}
	}
	
	public String fullCellText() {
		return super.getRealCell();
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(getRealCell());
	}
	
}