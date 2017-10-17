import java.util.Scanner;
/**
 * Write a description of class QuadraticClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuadraticClient
{
    public static void main(String[] args){
        boolean done = false;
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        String finished;
        while(!done){
            System.out.println("Welcome to the Quadratic Describer");
            System.out.println("Please provide values for coefficients a, b, and c\n");
            System.out.print("a: ");
            a = input.nextDouble();
            System.out.print("b: ");
            b = input.nextDouble();
            System.out.print("c: ");
            c = input.nextDouble();
            System.out.println(Quadratic.quadrDescriber(a, b, c));
            
            System.out.println("Do you want ot keep going? (Type \"quit\" to end)");
            finished = input.next();
            if(finished.equals("quit")){
                done = true;
            }
        }
    }
}
