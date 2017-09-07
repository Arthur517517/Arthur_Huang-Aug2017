
/**
 * This class calls the methods of the class Calcualte.
 * Arthur Huang
 * 9/6/2017
 */
public class DoMath
{
    public static void main(String[] args){
        System.out.println(Calculate.square(5));
        System.out.println(Calculate.toMixedNum(7, 5));
        System.out.println(Calculate.toImproperFrac(3, 1, 2));
        System.out.println(Calculate.foil(3, 4, 5 ,6, "x"));
        System.out.println(Calculate.isDivisibleBy(40, 8));
        System.out.println(Calculate.absValue(-0.876));
        System.out.println(Calculate.max(3,7));
    }
}
