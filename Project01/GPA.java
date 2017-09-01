
/**
 * This program calculates the GPA.
 *
 * Arthur Huang
 * 9/1/2017
 */
public class GPA
{
    public static void main(String[] args){
        calculateGPA(2.0, 4.0, 5.0);
    }
    
    public static void calculateGPA(double grade1, double grade2, double grade3){
        double GPA = (grade1 + grade2 + grade3) / 3;
        System.out.println("Your grades are: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.format("Your GPA is: %.2f" , GPA);
    }
}

