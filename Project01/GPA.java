
/**
 * This program calculates the GPA.
 *
 * Arthur Huang
 * 9/1/2017
 */
public class GPA
{
    public static void main(String[] args){
        double gpa = calculateGPA(2.0, 4.0, 5.0);
        printGPA(gpa);
    }
    
    public static double calculateGPA(double grade1, double grade2, double grade3){
        double GPA = (grade1 + grade2 + grade3) / 3;
        return GPA;
    }
    public static void printGPA(double gpa){
        System.out.format("GPA: %.2f" , gpa);
    }
}

