public class TextCell implements Cell{
	private String entry;
	public TextCell(String entry) {
		this.entry = entry;
	}
	
	
	public String abbreviatedCellText() {
		return entry.substring(1,11);
	}
	
	public String fullCellText() {
		return entry;
	}
}