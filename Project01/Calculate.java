import java.text.DecimalFormat;
/**
 * This class contains various methods that perform mathematic calculations
 * Arthur Huang
 * 9/6/2017
 */
public class Calculate
{
    //returns a number squared
    public static int square(int number){
        return number * number;
    }
    //returns a number cubed
    public static int cube(int number){
        return number * number * number;
    }
    //finds the average 2 type double numbers
    public static double average(double num1, double num2){
        return (num1 + num2)/2;
    }
    //overloaded method, finds the average of 3 numbers
    public static double average(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
    //converts radians to degrees
    public static double toDegrees(double radian){
        double pi = 3.14159;
        return radian * (180 / pi);
    }
    //converts degrees to radians
    public static double toRadians(double degree){
        double pi = 3.14159;
        return degree * (pi / 180);
    }
    //uses the formula of discriminant: b^2 - 4*a*c
    public static double discriminant(double a, double b, double c){
        return (b * b) - 4 * a * c;
    }
    //converts a mixed number to improper fraction
    public static String toImproperFrac(int wholeNum, int numerator, int denominator){
        int impNume = wholeNum * denominator + numerator;
        String improperFrac = new String(impNume + "/" + denominator);
        return improperFrac;
    }
    //converts an improper fraction to a mixed number
    public static String toMixedNum(int numerator, int denominator){
        int wholeNum = numerator / denominator;
        int mixedNume = numerator - wholeNum * denominator;
        String mixedNum = new String(wholeNum + "_" + mixedNume + "/" + denominator);
        return mixedNum;
    }
    //uses FOIL to return a simplified equation
    public static String foil(int a, int b, int c, int d, String x){
        String foiled = new String(a*c + x + "^2 " + "+ " + (a*d + b*c) + x +" + " + b*d);
        return foiled;
    }
    //checks if a is divisible by b, returns a boolean value
    public static boolean isDivisibleBy(int divident, int divisor){
        return divident % divisor == 0;
    }
    //returns the absolute value of a number
    public static double absValue(double number){
        if(number < 0){
            number *= -1;//converts a negative number to a positive number
        }
        return number;
    }
    //finds the largest value between 2 numbers
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
    //finds the largest number between 3 numbers
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
    //finds the smallest number between 2 numebrs
    public static int min(int number1, int number2){
        int minNum = number1;
        if(number2 < number1){
            minNum = number2;
        }
        return minNum;
    }
    //rounds a double value to 2 decimal places
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
}
