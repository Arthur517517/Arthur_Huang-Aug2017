 
/*Arthur Huang
 *AP CompSci Period 2 
 *4/13/2018
 *This class implements methods in the superclass RealCell, and helps formula cell function properly
 *This class contains methods that allow users to utilize formulas
 */
public class FormulaCell extends RealCell{
	private Spreadsheet grid;
	public FormulaCell(String entry, Spreadsheet grid) {//constructor takes in a Spreadsheet so this class can use methods in SpreadSheet
		super(entry);//passes the user input into constructor in RealCell
		this.grid = grid;
	}
	
	public String abbreviatedCellText() {
		String finalString = getDoubleValue() + "";//the double given by getDoubleValue is displayed as a String
		if(finalString.length() < 10) {
			return fillSpaces(finalString);//use the fillSpaces method in RealCell to add spaces
		}else {
			return finalString.substring(0, 10);
		}
		
	}

	public String fullCellText() {
		return super.getRealCell();
	}
	
	public double getDoubleValue() {//returns the calculation result as a double
		String modified = getRealCell().substring(2, getRealCell().length()-2);//get the piece of string excluding the parentheses and spaces
		String[] arr = modified.split(" ");//split at the space in the expression
		double result = 0;
		if(arr[0].toLowerCase().equals("sum")) {//checks if the first element is sum
			result = sum(arr[1].toLowerCase());
		}else if(arr[0].toLowerCase().equals("avg")) {
			result = avg(arr[1].toLowerCase());//toLowerCase prevents case sensitivity
	    }else{
			result = getCellVal(arr[0]);
		}
		
		if(!(arr.length == 1)) {	
			for(int i = 1; i < arr.length; i += 2) {//evaluates the entire expression, skipping the operators
				if(arr[i].equals("+")){
					result += getCellVal(arr[i+1]);
				}else if(arr[i].equals("-")) {
					result -= getCellVal(arr[i+1]);
				}else if(arr[i].equals("*")){
					result *= getCellVal(arr[i+1]);//calls getCellVal and adds it to result, using only actual values in the expression
				}else if(arr[i].equals("/")){
					result /= getCellVal(arr[i+1]);
				}
			}
		}
		return result;
	}
	
	public double getCellVal(String ele) {//get the value at a specific location, as a double
		if(!(Character.isDigit(ele.charAt(0))) && !(ele.charAt(0) == '-')){
			RealCell a = (RealCell) grid.getCell(new SpreadsheetLocation(ele));//casts the existing cell into a RealCell to use getDoubleValue
			return a.getDoubleValue();
		}else {
			return Double.parseDouble(ele);//if argument is not a location, simply return the current value
		}
	}
	
	public double sum(String expression) {//return a sum of all the values of cells user selects
		String[] operands = expression.toLowerCase().split("-");//split at "-" to determine the start and end locations
		int startNum = Integer.parseInt(operands[0].substring(1));
		int endNum = Integer.parseInt(operands[1].substring(1));
		char startChar = operands[0].charAt(0);
		char endChar = operands[1].charAt(0);
		double sum = 0;
		for(char i = startChar; i <= endChar; i++) {//loops through the user-slected mini 2d grid to add all values 
			for(int j = startNum; j <= endNum; j++) {
				SpreadsheetLocation loc = new SpreadsheetLocation("" + i + j);//concatenates i,j, and "" to make a location
				if(grid.getCell(loc) instanceof RealCell) {//only get cell if its a RealCell
					RealCell temp = (RealCell)(grid.getCell(loc));
					sum += temp.getDoubleValue();
				}
			}
		}
		return sum;
	}
	
	public double avg(String expression) {
		String[] operands = expression.split("-");//splits at "-" to determine the start and end locations
		int startNum = Integer.parseInt(operands[0].substring(1));
		int endNum = Integer.parseInt(operands[1].substring(1));//endNum is the piece of String after the letter
		char startChar = operands[0].charAt(0);
		char endChar = operands[1].charAt(0);
		double s = sum(expression);//get the sum of all the cells user selected
		int totalCol = (endChar - startChar) + 1;//+1 gives actual amount of columns
		int totalRow = (endNum - startNum) + 1;
		return s/(totalCol * totalRow);//average is total/number of cells
	}
}