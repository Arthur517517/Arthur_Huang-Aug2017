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
            if(!(userExpr.equals("quit"))) {
                System.out.println(produceAnswer(userExpr));
            }else {
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
        if(operator.equals("+") || operator.equals("-")){
            notReduced = plusMinus(operator, totalNume1, totalNume2, denom1, denom2);
            return notReduced[0] + "/" + notReduced[1];
        }else {
            notReduced = multiplyDivide(operator, totalNume1, totalNume2, denom1, denom2);
            return notReduced[0] + "/" + notReduced[1];
        }
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
        int totalDenom = denom1 * denom2;
        int[] improp = new int[2];
        improp[1] = totalDenom;
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
}
