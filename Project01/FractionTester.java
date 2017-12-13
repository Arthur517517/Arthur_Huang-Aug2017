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
                Fraction exp1 = new Fraction(userExpr);
                exp1.produceAnswer();
                System.out.println(exp1.toString());
            }else{
                done = true;
            }
        }
    }
}
