public class ValueCell extends RealCell{
	public ValueCell(String entry) {
		super(entry);
	}
	public String abbreviatedCellText() {
		String cellText = Double.toString(getDoubleValue());
		if(cellText.length() < 10) {
			if(!cellText.contains(".")) {    //checks if its a whole number 
				cellText += ".0";
			}
			return super.fillSpaces(cellText);
		}else {	
			return cellText.substring(0,10);
		}
	}
	
	public String fullCellText() {
		return getRealCell();
	}
	
	public double getDoubleValue() {
		return Double.parseDouble(getRealCell());
	}
	
}
