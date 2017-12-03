import java.util.Scanner;
public class FracCalc {
    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
        boolean done = false;
        String userExpr;
        Scanner input = new Scanner(System.in);
        while(!done){
            System.out.println("Enter your expression: ");
            userExpr = input.nextLine();
            if(!(userExpr.equals("quit"))){
                System.out.println(produceAnswer(userExpr));
            }else{
                done = true;
            }
        }
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] splitArr = input.split(" ");
        String firstOperand = splitArr[0];
        String operator = splitArr[1];
        String secondOperand = splitArr[2];
        String[] answerStringOp1 = new String[3];
        String[] answerStringOp2 = new String[3];
        
        parseOperands(firstOperand, answerStringOp1);
        parseOperands(secondOperand, answerStringOp2);
        
        int whole1 = Integer.parseInt(answerStringOp1[0]);
        int nume1 = Integer.parseInt(answerStringOp1[1]);
        int denom1 = Integer.parseInt(answerStringOp1[2]);
        
        int whole2 = Integer.parseInt(answerStringOp2[0]);
        int nume2 = Integer.parseInt(answerStringOp2[1]);
        int denom2 = Integer.parseInt(answerStringOp2[2]);
        
        int[] notReduced;
        int totalNume1 = toImproper(whole1, nume1, denom1);
        int totalNume2 = toImproper(whole2, nume2, denom2);
        String reduced;
        if(operator.equals("+") || operator.equals("-")){
            notReduced = plusMinus(operator, totalNume1, totalNume2, denom1, denom2);
            //return notReduced[0] + "/" + notReduced[1];
        }else{
            notReduced = multiplyDivide(operator, totalNume1, totalNume2, denom1, denom2);
            //return notReduced[0] + "/" + notReduced[1];
        }
        reduced = reduce(notReduced);
        return reduced;
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static void parseOperands(String operand, String[] answer){
        String wholeNumber = "";
        String numerator = "";
        String denominator = "";
        String[] slashUnderscore;
        String[] splitUnderscore = operand.split("_");
        if(splitUnderscore.length == 2){
            wholeNumber = splitUnderscore[0];
            slashUnderscore = splitUnderscore[1].split("/");
            if(slashUnderscore.length == 2){
                numerator = slashUnderscore[0];
                denominator = slashUnderscore[1];
            }
        }else{
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
        answer[0] = wholeNumber;
        answer[1] = numerator;
        answer[2] = denominator;
    }
    public static int[] plusMinus(String operator, int totalNume1, int totalNume2, int denom1, int denom2){
        int[] improp = new int[2];
        improp[1] = denom1 * denom2;
        if(operator.equals("+")){
            improp[0] = (totalNume1 * denom2) + (totalNume2 * denom1);
        }else{
            improp[0] = totalNume1 * denom2 - totalNume2 * denom1;
        }
        return improp;
    }
    public static int[] multiplyDivide(String operator, int totalNume1, int totalNume2, int denom1, int denom2){
        int[] improp2 = new int[2];
        if(operator.equals("*")){
            improp2[0] = totalNume1 * totalNume2;
            improp2[1] = denom1 * denom2;
        }else{
            improp2[0] = totalNume1 * denom2;
            improp2[1] = totalNume2 * denom1;
        }
        return improp2;
    }
    public static int toImproper(int wholeNum, int numerator, int denominator){
        int totalNume;
        if(wholeNum < 0){
            totalNume = wholeNum * denominator - numerator;
        }else{
            totalNume = wholeNum * denominator + numerator;
        }
        return totalNume;
    }
    public static String reduce(int[] improper){
        int reducedNume;
        int reducedDenom;
        int whole;
        int gCF;
        if(improper[0] == 0){
            return "0";
        }else if(improper[0] == improper[1]){
            return "1";
        }else if(isDivisibleBy(improper[0], improper[1])){
            whole = improper[0] / improper[1];
            return "" + whole;
        }else if((absValue(improper[0]) > improper[1]) && !(isDivisibleBy(improper[0], improper[1]))){
            whole = improper[0] / improper[1];
            reducedNume = absValue(improper[0]) % improper[1];
            gCF = gcf(reducedNume, improper[1]);
            reducedNume /= gCF;
            improper[1] /= gCF;
            if(whole == 0){
                if(improper[1] < 0) {
                    reducedNume *= -1;
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
    public static int gcf(int number1, int number2){
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
    public static int absValue(int number){
        if(number < 0){
            number *= -1;//converts a negative number to a positive number
        }
        return number;
    }
    public static boolean isDivisibleBy(int divident, int divisor){
        return divident % divisor == 0;
    }
}
