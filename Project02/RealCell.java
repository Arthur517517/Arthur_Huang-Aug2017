 
public abstract class RealCell implements Cell{
	private String entry;
	public RealCell(String entry) {
		this.entry = entry;
	}
	
	public abstract double getDoubleValue();
	
	
	public String abbreviatedCellText() {
		return "";
	}
	
	public String fullCellText() {
		return "";
	}
}
