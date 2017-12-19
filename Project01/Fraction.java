
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    private int wholeNumber;
    private int numerator;
    private int denominator;
    private int[] parsedOperand;
    public Fraction(String operand)
    {
        parsedOperand = parseOperand(operand);
        this.wholeNumber = parsedOperand[0];
        this.numerator = parsedOperand[1];
        this.denominator = parsedOperand[2];
    }
    private static int[] parseOperand(String operand){//process the input to determine the first operand, operator, and second operand
        String wholeNumber = "";
        String numerator = "";
        String denominator = "";
        int[] answer = new int[3];
        String[] slashUnderscore;
        String[] splitUnderscore = operand.split("_");//split the input at underscore
        if(splitUnderscore.length == 2){//if the input is a mixed number
            wholeNumber = splitUnderscore[0];//set the first element to wholeNumber
            slashUnderscore = splitUnderscore[1].split("/");//split at slash to find numerator/denominator
            if(slashUnderscore.length == 2){
                numerator = slashUnderscore[0];
                denominator = slashUnderscore[1];
            }
        }else{//if there is no wholeNumber
            slashUnderscore = operand.split("/");
            if(slashUnderscore.length == 2){
                wholeNumber = "0";
                numerator = slashUnderscore[0];
                denominator = slashUnderscore[1];
            }else{
                wholeNumber = splitUnderscore[0];
                numerator = "0";
                denominator = "1";
            }
        }
        answer[0] = Integer.parseInt(wholeNumber);
        answer[1] = Integer.parseInt(numerator);
        answer[2] = Integer.parseInt(denominator);
        return answer;
    }
    public int getWhole(){
        return wholeNumber;
    }
    public int getNume(){
        return numerator;
    }
    public int getDenom(){
        return denominator;
    }
}
