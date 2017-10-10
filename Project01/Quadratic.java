
/**
 * This class is responsible for the calculations QuadraticClient need to
 * print out information about a parabola
 * Arthur Huang
 * 10/10/2017
 */
public class Quadratic
{
    public static String quadrDescriber(double a, double b, double c){
        String parabolaInfo = "Description of the graph of: \n" + "y = " + 
            a + "x^2 + " + b + " + " + c + "\n\n\n";
        if(a < 0){
            parabolaInfo += "The parabola opens down.";
        }
        return parabolaInfo;
    }
}
