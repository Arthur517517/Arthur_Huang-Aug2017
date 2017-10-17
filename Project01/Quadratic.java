
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
            a + "x^2 + " + b + " + " + c + "\n\n";
        if(a < 0){
            parabolaInfo += "Opens: Down\n";
        }else{
            parabolaInfo += "Opens: Up\n";
        }
        double vertX = -b / (2 * a);
        double vertY = a * vertX * vertX + b * vertX + c;
        String xIntercepts = quadForm(a, b, c);
        
        parabolaInfo += "Axis of Symmetry: " + vertX + "\n";
        parabolaInfo += "Vertex: (" + vertX + ", " + vertY + ")\n";
        parabolaInfo += "x-intercept(s): " + xIntercepts + "\n";
        parabolaInfo += "y-intercept: " + c + "\n\n";
        return parabolaInfo;
    }
    public static double sqrt(double number){
        double estimate; 
        double squareRoot;
        if(number < 0){//throws an exception if the input is a negative number
            throw new IllegalArgumentException("Your input is a negative numebr");
        }
        else if(number == 0){
            squareRoot = 0;
        }
        else if(number > 0){
            squareRoot = number / 2;
            do{
                estimate = squareRoot;
                squareRoot = (estimate + (number / estimate)) / 2;
            }while ((estimate - squareRoot) != 0);
        }else{
            squareRoot = number;
        }
        return round2(squareRoot);
    }
    public static String quadForm(double a, double b, double c){
        if(discriminant(a, b, c) < 0){//if the output after calling the discriminant is a negative number
            return "No real roots.";
        }
        else if(discriminant(a, b, c) == 0){
            double root = round2(-b / (2 * a));
            String answer = root + "";
            return answer;
        }
        else{
            double smallRoot = round2((-b + (sqrt(discriminant(a,b,c)))) / (2*a));//rounds answer to two decimal places
            double bigRoot = round2((-b - (sqrt(discriminant(a,b,c)))) / (2*a));
            String answer = smallRoot + " and " + bigRoot;
            return answer;
        }
    }
    public static double round2(double number){
        if(number < 0){//rounds a number that is negative
            number *= -1;//converts the number to a positive number
            if(number * 1000 % 10 < 5){
                number = (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                number = (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
            number *= -1;//converts the number back to a negative number
            return number;
        }
        else{//rounds a number that is positive
            if(number * 1000 % 10 < 5){
                return (number * 1000 - number * 1000 % 10) / 1000;
            }
            else{
                return (10 - number * 1000 % 10 + number * 1000) / 1000;
            }
        }
    }
    public static double discriminant(double a, double b, double c){
        return (b * b) - 4 * a * c;
    }
}
