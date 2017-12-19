
/**
 * Write a description of class FractionCalculation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractionCalculation
{
    private int totalNume1;
    private int totalNume2;
    private int denom1;
    private int denom2;
    private String operator;
    private int[] notReduced;
    public FractionCalculation(Fraction firstFraction, String operator, Fraction secondFraction){
        this.totalNume1 = toImproper(firstFraction.getWhole(), firstFraction.getNume(), firstFraction.getDenom());
        this.totalNume2 = toImproper(secondFraction.getWhole(), secondFraction.getNume(), secondFraction.getDenom());
        this.denom1 = firstFraction.getDenom();
        this.denom2 = secondFraction.getDenom();
        this.operator = operator;
    }
    public String calculateResult(){
        if(operator.equals("+") || operator.equals("-")){
            notReduced = plusMinus(operator, totalNume1, totalNume2, denom1, denom2);
        }else{
            notReduced = multiplyDivide(operator, totalNume1, totalNume2, denom1, denom2);
        }
        return reduce(notReduced);
    }
    private int[] plusMinus(String operator, int totalNume1, int totalNume2, int denom1, int denom2){
        int[] improp = new int[2];
        improp[1] = denom1 * denom2;//multiply denominators to find common denominator
        if(operator.equals("+")){
            improp[0] = (totalNume1 * denom2) + (totalNume2 * denom1);//use denom1 and denom2 to multiply whats needed to get the common denominator
        }else{
            improp[0] = totalNume1 * denom2 - totalNume2 * denom1;
        }
        return improp;
    }
    private int[] multiplyDivide(String operator, int totalNume1, int totalNume2, int denom1, int denom2){//calculates the fraction if it's multiply or divide
        int[] improp2 = new int[2];
        if(operator.equals("*")){
            improp2[0] = totalNume1 * totalNume2;
            improp2[1] = denom1 * denom2;
        }else{
            improp2[0] = totalNume1 * denom2;//dividing a fraction is the same as multiplying its reciprocal
            improp2[1] = totalNume2 * denom1;
        }
        return improp2;
    }
    private int toImproper(int wholeNum, int numerator, int denominator){//does calculation do produce an answer that is an improper fraction
        int totalNume;
        if(wholeNum < 0){//if wholeNum is a negative number
            totalNume = wholeNum * denominator - numerator;
        }else{
            totalNume = wholeNum * denominator + numerator;//find totalNume
        }
        return totalNume;
    }
    private String reduce(int[] improper){//reduce the improper fraction
        int reducedNume;
        int reducedDenom;
        int whole;
        int gCF;
        if(improper[0] == 0){//if the numerator is 0
            return "0";
        }else if(improper[0] == improper[1]){//is the result will be 1
            return "1";
        }else if(isDivisibleBy(improper[0], improper[1])){//if numerator is divisible by denominator
            whole = improper[0] / improper[1];
            return "" + whole;
        }else if((absValue(improper[0]) > improper[1]) && !(isDivisibleBy(improper[0], improper[1]))){//if numerator is greater but not divisible by denominator
            whole = improper[0] / improper[1];
            reducedNume = absValue(improper[0]) % improper[1];//find numerator
            gCF = gcf(reducedNume, improper[1]);
            reducedNume /= gCF;//find reducedNume
            improper[1] /= gCF;
            if(whole == 0){
                if(improper[1] < 0) {
                    reducedNume *= -1;//changes the negative sign from denominator to numerator, answer is the same
                    improper[1] *= -1;
                }
            	return reducedNume + "/" + improper[1];
            }else
                return whole + "_" + reducedNume + "/" + absValue(improper[1]);
        }else{
            gCF = gcf(improper[0], improper[1]);
            reducedNume = improper[0] / gCF;
            reducedDenom = improper[1] / gCF;
            return reducedNume + "/" + reducedDenom;
        }
    }
    private int gcf(int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        while(number2 != 0){
            if(isDivisibleBy(num1, num2)){
                number1 = number2;//returns number 2 if number1 is divisible by number2
            }
            else{
                int number3 = number1;
                number1 = number2;//swaps the values of number1 and number2
                number2 = number3 % number2;
            }
        }
        return (int) absValue(number1);
    }
    private int absValue(int number){
        if(number < 0){
            number *= -1;//converts a negative number to a positive number
        }
        return number;
    }
    private boolean isDivisibleBy(int divident, int divisor){
        return divident % divisor == 0;
    }
    
}
