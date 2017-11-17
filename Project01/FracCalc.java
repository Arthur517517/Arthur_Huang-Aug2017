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
            userExpr = input.next();
            System.out.println(produceAnswer(userExpr));
            if(userExpr.equals("quit")){
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
        String secondOperand = splitArr[splitArr.length - 1];
        String[] answerString = new String[3];
        parseOperands(secondOperand, answerString);
        return "whole:" + answerString[0] + " numerator:" + answerString[1] + " denominator:" + answerString[2];
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
}
