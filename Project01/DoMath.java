
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
    }
}
