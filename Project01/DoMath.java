
/**
 * This class calls the methods of the class Calcualte.
 * Arthur Huang
 * 9/6/2017
 */
public class DoMath
{
    public static void main(String[] args){
        //The following statements calls the method in Calculate class and pint out the values
        System.out.println(Calculate.square(5));
        System.out.println(Calculate.cube(79));
        System.out.println(Calculate.average(2.4, 7.59));
        System.out.println(Calculate.average(3.5, 7,9));
        System.out.println(Calculate.toDegrees(6.28));
        System.out.println(Calculate.toRadians(360));
        System.out.println(Calculate.discriminant(3, 4, 5));
        System.out.println(Calculate.toImproperFrac(3, 1, 2));
        System.out.println(Calculate.toMixedNum(7, 5));
        System.out.println(Calculate.foil(3, 4, 5 ,6, "x"));
        System.out.println(Calculate.isDivisibleBy(-40, 8));
        System.out.println(Calculate.absValue(-0.876));
        System.out.println(Calculate.max(3, 7));
        System.out.println(Calculate.max(4.5, 7.8 , -10.9));
        System.out.println(Calculate.min(1, -1));
        System.out.println(Calculate.round2(-70.989));
        System.out.println(Calculate.exponent(2, 3));
        System.out.println(Calculate.factorial(0));
        System.out.println(Calculate.isPrime(87));
        System.out.println(Calculate.gcf(256, 488));
        System.out.println(Calculate.sqrt(3));
    }
}
