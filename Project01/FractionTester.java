import java.util.Scanner;
/**
 * Write a description of class FractionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractionTester
{
    public static void main(String[] args) 
    {//ask the user for expressions to calculate
        // TODO: Read the input from the user and call produceAnswer with an equation
        boolean done = false;
        String userExpr;
        Scanner input = new Scanner(System.in);
        while(!done){//loops until the user types quit
            System.out.println("Enter your expression: ");
            userExpr = input.nextLine();
            if(!(userExpr.equals("quit"))){
                System.out.println(produceAnswer(userExpr));
            }else{
                done = true;
            }
        }
    }
    public static String produceAnswer(String input)//returns the final answer of calculation, simplified
    { 
        // TODO: Implement this function to produce the solution to the input
        String[] splitArr = input.split(" ");//split the input at space
        Fraction op1 = new Fraction(splitArr[0]);
        String operator = splitArr[1];
        Fraction op2 = new Fraction(splitArr[2]);
        FractionCalculation expression = new FractionCalculation(op1, operator, op2);
        return expression.calculateResult();
    }
}
