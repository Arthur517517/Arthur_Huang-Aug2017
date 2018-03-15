public class TextCell implements Cell{
	private String entry;
	public TextCell(String entry) {
		this.entry = entry;
	}
	
	
	public String abbreviatedCellText() {
		String abbr = entry.substring(1, entry.length()-1);
		if(abbr.length() < 10) {
			while(abbr.length() < 10) {
				abbr += " ";
			}
			return abbr;
		}else {
			return entry;
		}
		
	}
	
	public String fullCellText() {
		return entry;
	}
}