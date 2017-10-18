import java.util.Scanner;
/**
 * This class calls the method quadrDescriber until the user enters "quit"
 *
 * Arthur Huang
 * 10/17/2017
 */
public class QuadraticClient
{
    public static void main(String[] args){
        boolean done = false;
        Scanner input = new Scanner(System.in);//initiates a Scanner object
        double a;
        double b;
        double c;
        String finished;
        System.out.println("Welcome to the Quadratic Describer");
        System.out.println("Please provide values for coefficients a, b, and c");
        while(!done){//keeps on calling the method quadrDescriber when the user is not done
            System.out.println();
            System.out.print("a: ");
            a = input.nextDouble();//ask user for an input type double
            System.out.print("b: ");
            b = input.nextDouble();
            System.out.print("c: ");
            c = input.nextDouble();
            System.out.println();
            System.out.println(Quadratic.quadrDescriber(a, b, c));
            
            System.out.println("Do you want ot keep going? (Type \"quit\" to end)");
            finished = input.next();
            if(finished.equals("quit")){//checks if user input is "done"
                done = true;
            }
        }
    }
}
