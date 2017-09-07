/**
 * This class contains various methods that perform mathematic calculations
 * Arthur Huang
 * 9/6/2017
 */
public class Calculate
{
    public static int square(int number){
        return number * number;
    }
    public static int cube(int number){
        return number * number * number;
    }
    public static double average(double num1, double num2){
        return (num1 + num2)/2;
    }
    public static double average(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
    public static double toDegrees(double radian){
        double pi = 3.14159;
        return radian * (180 / pi);
    }
    public static double toRadians(double degree){
        double pi = 3.14159;
        return degree * (pi / 180);
    }
    public static double discriminant(double a, double b, double c){
        return (b * b) - 4 * a * c;
    }
    public static String toImproperFrac(int wholeNum, int numerator, int denominator){
        int impNume = wholeNum * denominator + numerator;
        String improperFrac = new String(impNume + "/" + denominator);
        return improperFrac;
    }
    public static String toMixedNum(int numerator, int denominator){
        int wholeNum = numerator / denominator;
        int mixedNume = numerator - wholeNum * denominator;
        String mixedNum = new String(wholeNum + "_" + mixedNume + "/" + denominator);
        return mixedNum;
    }
    public static String foil(int a, int b, int c, int d, String x){
        String foiled = new String(a*c + x + "^2 " + "+ " + (a*d + b*c) + x +" + " + b*d);
        return foiled;
    }
    public static boolean isDivisibleBy(int divident, int divisor){
        return divident % divisor == 0;
    }
    public static double absValue(double number){
        if(number < 0){
            number *= -1;
        }
        return number;
    }
    public static double max(double number1, double number2){
        double largestNum;
        if(number1 > number2){
            largestNum = number1;
        }
        else{
            largestNum = number2;
        }
        return largestNum;
    }
    public static double max(double number1, double number2, double number3){
        double largestNum = number1;
        if(number2 > number1){
            largestNum = number2;
        }
        if(number3 > number2){
            largestNum = number3;
        }
        return largestNum;
    }
}
