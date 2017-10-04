import java.util.Scanner;
/**
 * This class contains a program that allows users to input numbers, find
 * the largest and smallest numbers, find the largest even number, and find
 * the sum of all even numbers.
 * Arthur Huang
 * 10/4/2017
 */
public class ProcessingNumbers
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean completed = false;
        int userInput;
        int largestNum;
        int smallestNum;
        while(!completed){
            System.out.println("Enter a number(type \"done\") when finished: ");
            userInput = input.nextInt();
            largestNum = userInput;
            smallestNum = userInput;
            System.out.println("Are you done?");
            String finished = input.next();
            if(finished.equals("done")){
                completed = true;
            }
            userInput ++;
            System.out.println(userInput);
        }
    }
}
